package 나머지연산자문제;

// 100의 자리 정수를 입력 받아서 3개의 변수에 대입하기(100자리/10자리/1자리)에 대입하기
//365
//a = 3
//b = 6
//c = 5

import java.util.Scanner;

public class ModEx1 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");

        int num = scanner.nextInt();

        int a = num / 100;//100을 나눈 몫을 취한다
        int b = (num % 100) / 10;//100의 나머지에 10을 나눈다
        int c = num % 10;//10으로 나누고 남은 나머지로 1의자리 표현

        System.out.println("100의 자리 : " + a + " 10의 자리 : " + b + " 1의 자리 ; " + c);

    }
}
