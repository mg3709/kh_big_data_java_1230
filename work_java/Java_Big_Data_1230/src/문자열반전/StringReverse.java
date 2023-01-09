package 문자열반전;
//abcdefg ==> gfedcba
//힌트 : for문을 이용, while문으로도 가능

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("문자를 입력하세요 : ");
        String str = scanner.next();

        int index = str.length();
        while(true){

            index--;
            System.out.print(str.charAt(index));

            if(index == 0)break;


        }

    }
}
