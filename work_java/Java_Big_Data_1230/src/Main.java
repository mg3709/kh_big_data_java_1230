import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("문자를 입력하세요 : ");
            String str = scanner.next();

            if(str.equals("exit") && str.equals("종료")){
                System.out.println("프로그램 종료");
                break;
            }else System.out.println(str.length() + "글자 입니다");
        }
    }
}