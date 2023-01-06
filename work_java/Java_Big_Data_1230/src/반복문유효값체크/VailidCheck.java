package 반복문유효값체크;

//반복문을 이용해서 유효값 체크 하기 (while 반복문 사용)
//do ~ while() : 먼저 수행 후 조건 확인

import java.util.Scanner;

public class VailidCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age;
        boolean isFirst = true;
        do {

            if(!isFirst) System.out.println("나이를 잘못 입력하셨습니다");
            System.out.println("나이를 입력 하세요 : ");

            age = scanner.nextInt();
            isFirst = false;
        }while (age <= 0 || age >= 200);

        System.out.println("입력하신 나이는" + age + "입니다");

    }

}
