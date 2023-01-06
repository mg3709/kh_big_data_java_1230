package 조건문연습문제1;

//성적을 입력 받음
//입력받은 수가 0 ~ 100사이가 아니면 "잘못 입력 하였습니다" 출력
//90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D, 나머지는 F

import java.util.Scanner;

public class ScoreGrade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요 : ");

        int score = scanner.nextInt();

        if(score > 0 && score < 100){

            if(score >= 90){

                System.out.println("A");


            } else if (score >= 80) {

                System.out.println("B");

            } else if (score >= 70) {

                System.out.println("C");

            } else if (score >= 60) {

                System.out.println("D");

            }else {

                System.out.println("F");

            }

        }else{

            System.out.println("잘못 입력하셨습니다");

        }

    }

}
