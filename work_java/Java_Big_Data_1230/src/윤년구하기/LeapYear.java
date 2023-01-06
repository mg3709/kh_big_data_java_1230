package 윤년구하기;

// 4로 나누어지면 윤년 : 4로 나눈 나머지가 0
// 100으로 나누어 떨어지는 연도는 윤년이 아님
// 400으로 나누어 떨어지면 윤년

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요 : ");
        int year = scanner.nextInt();

        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){

            System.out.println("윤년입니다");

        }else{

            System.out.println("윤년이 아닙니다");

        }

    }

}
