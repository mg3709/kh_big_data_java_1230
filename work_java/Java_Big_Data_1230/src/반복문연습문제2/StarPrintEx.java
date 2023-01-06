package 반복문연습문제2;

//입력 : 5
//*
//* *
//* * *
//* * * *
//* * * * *

import java.util.Scanner;

public class StarPrintEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("별의 갯수 입력 : ");

        int star = scanner.nextInt();

        for(int i=0;i<star;i++){

            for(int j=0;j<i+1;j++){

                System.out.print("* ");

            }

            System.out.println();

        }
    }

}
