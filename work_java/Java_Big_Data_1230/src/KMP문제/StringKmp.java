package KMP문제;
//입력 : Kunth-Morris-Pratt
//출력 : KMP
//입력 : Mirko-Slavko
//출력 : MS

import java.util.Scanner;

public class StringKmp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("문자를 입력해주세요 : ");
        String a = scanner.next();

        //첫번째 방법 : split()
//        String[] splitName = a.split("-");
//
//        for(String e : splitName)System.out.print(e.charAt(0) + "\n");

        //두번째 방법 : 대문자만 골라내는 방법
//        for(int i = 0; i < a.length(); i++){
//
//            if(a.charAt(i) >= 'A' && a.charAt(i) <= 'Z'){//대문자 구간
//
//                System.out.print(a.charAt(i));
//
//            }
//
//        }

        //세번째 방법 : 0번째 문자 출력, 그리고 '-'다음 문자 출력
//        for(int i = 0; i < a.length(); i++){
//
//            if(i == 0)System.out.print(a.charAt(i));
//
//        }else{
//
//            if (a.charAt(i) == '-') System.out.print(a.charAt(i + 1);
//
//        }
//

        //네번째 방법 : 문자 배열로 변경후 대문자 골라내기
        char[] chName = a.toCharArray();

        for(char e : chName){

            if(e >= 'A' && e <= 'Z')System.out.print(e);

        }


    }
}
