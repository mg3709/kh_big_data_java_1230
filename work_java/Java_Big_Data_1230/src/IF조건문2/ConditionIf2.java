package IF조건문2;

import java.util.Scanner;

public class ConditionIf2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("영문자를 입력하세요 : ");

        char ch = scanner.next().charAt(0);

        if(ch >= 'a' && ch <= 'z'){

            System.out.println("알파벳 소문자 입니다");

        }
        else if(ch >= 'A' && ch <= 'Z'){

            System.out.println("알파벳 대문자 입니다");

        }
        else {

            System.out.println("영문자가 아닙니다");

        }

    }
}
