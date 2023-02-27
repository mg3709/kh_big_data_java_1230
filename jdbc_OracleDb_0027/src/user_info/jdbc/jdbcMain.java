package user_info.jdbc;

import user_info.jdbc.dao.user_infoDAO;
import user_info.jdbc.vo.user_infoVO;

import java.util.List;
import java.util.Scanner;

public class jdbcMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        user_infoDAO dao = new user_infoDAO();

        while(true){
            System.out.println("메뉴 선택 : ");
            System.out.print("[1]회원정보 보기 [2]회원가입 [3]exit : ");
            int sel = scanner.nextInt();
            switch(sel){
                case 1 :
                    List<user_infoVO> list = dao.userSelect();
                    dao.printUser(list);
                    break;
                case 2 :
                    dao.userInsert();
                    break;
                case 3 :
                    System.out.println("메뉴를 종료합니다");
                    return;
            }
        }
    }
}
