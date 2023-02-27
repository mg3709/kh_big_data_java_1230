package user_info.jdbc.dao;

import user_info.jdbc.util.Common;
import user_info.jdbc.vo.user_infoVO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class user_infoDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rset = null;
    Scanner scanner = new Scanner(System.in);

    public List<user_infoVO> userSelect(){
        List<user_infoVO> list = new ArrayList<>();
        try{
            conn = Common.getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM USER_INFO";
            rset = stmt.executeQuery(sql);

            while(rset.next()){
                String userName = rset.getString("USER_NAME");
                String email = rset.getString("EMAIL");
                String phone = rset.getString("PHONE");
                String addr = rset.getString("ADDRESS");
                String id = rset.getString("ID");
                String pwd = rset.getString("PWD");
                int point = rset.getInt("POINT");
                String card = rset.getString("CARDNUM");

                user_infoVO user = new user_infoVO(userName, email, phone, addr, id, pwd, point, card);
                list.add(user);
            }
            Common.close(rset);
            Common.close(stmt);
            Common.close(conn);

        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public void printUser(List<user_infoVO> list){
        for(user_infoVO e : list){
            System.out.println("사용자 이름 : " + e.getUserName());
            System.out.println("이메일 : " + e.getEmail());
            System.out.println("전화번호 : " + e.getPhone());
            System.out.println("주소 : " + e.getAddress());
            System.out.println("아이디 : " + e.getId());
            System.out.println("비밀번호 : " + e.getPwd());
            System.out.println("포인트 : " + e.getPoint());
            System.out.println("카드번호 : " + e.getCardnum());
            System.out.println();
        }
    }
    public void userInsert(){
        System.out.println("회원정보를 입력하세요");

        System.out.print("사용자 이름 : ");
        String userName = scanner.next();

        System.out.print("이메일 : ");
        String email = scanner.next();

        System.out.print("전화번호 : ");
        String phone = scanner.next();

        System.out.print("주소 : ");
        String addr = scanner.next();

        System.out.print("아이디 : ");
        String id = scanner.next();

        System.out.print("비밀번호 : ");
        String pwd = scanner.next();

        System.out.print("포인트 : ");
        int point = scanner.nextInt();

        System.out.print("카드번호 : ");
        String card = scanner.next();

        String sql = "INSERT INTO USER_INFO(USER_NAME, EMAIL, PHONE, ADDRESS, ID, PWD, POINT, CARDNUM) VALUES("
                + "'" + userName + "'" + ", " + "'" + email + "'" + ", "
                +"'" + phone + "'" + ", " + "'" + addr + "'" + ", "
                +"'" + id + "'" + ", " + "'" + pwd + "'" + ", "
                + point + ", " + "'" + card + "'" + ")";

        try{

            conn = Common.getConnection();
            stmt = conn.createStatement();
            int ret = stmt.executeUpdate(sql);
            System.out.println("Return : " + ret);

        }catch (Exception e){

            e.printStackTrace();

        }

        Common.close(stmt);
        Common.close(conn);

    }
}
