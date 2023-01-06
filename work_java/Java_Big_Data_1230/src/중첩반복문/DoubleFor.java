package 중첩반복문;

import java.util.Scanner;

public class DoubleFor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("별의 갯수를 입력하세요 : ");

        int number = scanner.nextInt();

        for(int i = 0;i < number;i++){//행 으로 취급된다

            System.out.printf("|%d|",i);

            for(int j = 0;j < number;j++){//열로 취급된다

                System.out.print("* ");

            }

            System.out.println();

        }

    }

}
