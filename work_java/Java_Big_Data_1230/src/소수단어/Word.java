package 소수단어;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("단어 입력 : ");
        String str = scanner.next();
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 'z' && str.charAt(i) > 'a') {
                num = str.charAt(i) - 38;
            }
            if (str.charAt(i) < 'Z' && str.charAt(i) > 'A') {
                num = str.charAt(i) - 96;
            }
        }

        for (int i = 2; i <= num; i++) {
            if (i % num == 0) {
                System.out.println("It is a prime word");
            } else {
                System.out.println("It is not a prime word");
            }
        }
    }
}