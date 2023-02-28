package Steam;

import Steam.dao.SteamDAO;
import Steam.vo.UserVO;

import java.util.List;
import java.util.Scanner;

public class jdbcMain {
    public static void main(String[] args) {
        MenuSelect();
    }

    public static void MenuSelect(){
        Scanner scanner = new Scanner(System.in);
        SteamDAO dao = new SteamDAO();

        while(true){
            System.out.println("======== 메뉴를 선택하세요 ========");
            System.out.print("[1]회원정보 [2]회원가입 [3]회원탈퇴 [4]회원정보수정 [5]exit");
            int sel = scanner.nextInt();
            switch(sel){
                case 1:
                    List<UserVO> list = dao.userSelect();
                    dao.userSelectRst(list);
                    break;
                case 2:
                    dao.UserInsert();
                    break;
                case 3:
                    dao.UserDelete();
                    break;
                case 4:
                    dao.UserUpdate();
                    break;
                case 5:
                    return;
            }
        }
    }
}
