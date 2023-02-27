package dao;


import util.Common;
import vo.EmpVO;


import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpDAO {
    Connection conn = null;//자바와 오라클에 대한 연결 설정
    Statement stmt = null;//SQL문을 수행하기 위한 객체
    ResultSet rs = null;//statement 동작에 대한 결과로 전달되는 DB의 내용
    Scanner scanner = new Scanner(System.in);

    public List<EmpVO> empSelect(){
        List<EmpVO> list = new ArrayList<>();//반환할 리스트를 위해 리스트 객체 생성

        try{
            conn = Common.getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM EMP";
            rs = stmt.executeQuery(sql);//select 문과 같이 여러개의 레코드(행)로 결과가 반환될 때 사용

            while(rs.next()){//읽을 행이 잇으면 참
                int no = rs.getInt("EMPNO");
                String name = rs.getString("ENAME");
                String job = rs.getString("JOB");
                int mgr = rs.getInt("MGR");
                Date date = rs.getDate("HIREDATE");
                int sal = rs.getInt("SAL");
                int comm = rs.getInt("COMM");
                int deptNo = rs.getInt("DEPTNO");

                EmpVO vo = new EmpVO(no, name, job, mgr, date, sal, comm, deptNo);//하나의 행(레코드)에 대한 정보 저장을 위한 객체 생성
                list.add(vo);//리스트 정보 추가

            }
            Common.close(rs);//연결과 역순으로 해제
            Common.close(stmt);
            Common.close(conn);

        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public void printEmpSelect(List<EmpVO> list){
        for(EmpVO e : list){
            System.out.println("사원번호 : " + e.getNo());
            System.out.println("이름 : " + e.getName());
            System.out.println("직책 : " + e.getJob());
            System.out.println("매니저 : " + e.getMgr());
            System.out.println("입사일 : " + e.getDate());
            System.out.println("급여 : " + e.getSal());
            System.out.println("성과급 : " + e.getComm());
            System.out.println("부서번호 : " + e.getDeptNo());
            System.out.println();

        }
    }

    public void empInsert(){
        System.out.println("사원 정보를 입력하세요");

        System.out.print(" 사원번호(4자리) : ");
        int no = scanner.nextInt();

        System.out.print("이름 : ");
        String name = scanner.next();

        System.out.print("직책 : ");
        String job = scanner.next();

        System.out.print("매니저(4자리) : ");
        int mgr = scanner.nextInt();

        System.out.print("입사일 : ");
        String date = scanner.next();

        System.out.print("급여 : ");
        int sal = scanner.nextInt();

        System.out.print("성과급 : ");
        int comm = scanner.nextInt();

        System.out.print("부서번호 : ");
        int deptNo = scanner.nextInt();

        String sql = "INSERT INTO EMP(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES("
                + no + ", " + "'" + name + "'" + ", " + "'" + job + "'" + ", "
                + mgr + ", " + "'" + date + "'" + ", "
                + sal + ", " + comm + ", " + deptNo + ")";

        try{
            conn = Common.getConnection();
            stmt = conn.createStatement();
            int ret = stmt.executeUpdate(sql);
            System.out.println("Return : " + ret);
        }catch(Exception e){
            e.printStackTrace();
        }
        Common.close(stmt);
        Common.close(conn);
    }
}
