package 입출력실습예제1;

//이름, 주소, 성별, 나이, 전화번호를 입력 받아 출력 받아서 출력 해보기

import java.util.Scanner;

public class ScannerEx1 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);//스캐너 객체 생성

        System.out.print("이름을 입력하세요 : ");
        String name = scanner.next();//문자열을 공백 기준으로 입력 받음
        scanner.nextLine();//버퍼 지우기(입력에서 버퍼가 지워지지 않아서 스킵이 되는 오류가 발생)

        System.out.print("주소를 입력하세요 : ");
        String addr = scanner.nextLine();//문자열을 줄바꿈 기준으로 입력 받음

        System.out.print("성별을 입력하세요 : ");
        char gender = scanner.next().charAt(0);//문자열에서 첫번째 문자를 입력받음

        System.out.print("나이를 입력하세요 : ");
        int age = scanner.nextInt();//키보드 입력을 정수로 입력 받음

        System.out.println("======== 회원 정보 출력 ========");
        System.out.println("이름 : " + name );
        System.out.println("주소 : " + addr );
        System.out.println("성별 : " + gender );
        System.out.println("나이 : " + age );


    }
}
