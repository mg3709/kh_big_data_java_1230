package Steam.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Common {
    final static String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:xe";
    final static String ORACLE_ID = "SCOTT";
    final static String ORACLE_PWD = "TIGER";
    final static String ORACLE_DRV = "oracle.jdbc.driver.OracleDriver";

    public static Connection getConnection(){
        Connection conn = null;
        try{
            Class.forName(ORACLE_DRV);
            conn = DriverManager.getConnection(ORACLE_URL,ORACLE_ID,ORACLE_PWD);
            System.out.println("Connection 성공");
        }catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(Connection conn){
        try{
            if(conn != null && !conn.isClosed()){
                conn.close();
                System.out.println("Connection 해체 성공");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void close(Statement stmt){
            try{
                if(stmt != null && !stmt.isClosed()){
                    stmt.close();
                    System.out.println("Statement 해체 성공");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    public static void close(ResultSet rset) {
        try{
            if(rset != null && !rset.isClosed()){
                rset.close();
                System.out.println("ResultSet 해체 성공");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
