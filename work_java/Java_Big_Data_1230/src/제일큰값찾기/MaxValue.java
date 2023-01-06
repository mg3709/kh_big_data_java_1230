package 제일큰값찾기;

//세자리의 정수를 입력 받아서 100자리, 10자리, 1자리로 나누어 담고 이중 가장 큰 수 찾기

import java.util.Scanner;

public class MaxValue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("세자리 정수를 입력하세요 : ");
        int num = scanner.nextInt();

        int a = num / 100;//100으로 나눈 몫을 넣어 줌
        int b = (num % 100) / 10;//100으로 나눈 나머지를 구하고, 다시 10으로 나눈 몫을 넣어줌
        int c = num % 10; //10을 나눈 나머지를 넣어줌

        if(a > b){

            System.out.println(Math.max(a,c));

        }else{

            System.out.println(Math.max(b,c));

        }

    }

}
