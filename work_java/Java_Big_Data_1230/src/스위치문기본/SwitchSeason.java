package 스위치문기본;

//스위치문은 조건문이며 스위치에는 조건식은 넣을 수 없고, 조건에 대한 변수만 올 수 잇음
//변수는 정수, 문자, 문자열만 사용 가능
//스위치의 각 케이스를 끝내기 위해서는 반드시 break문을 사용해야함
//해당하는 케이스가 없는 경우를 위해 default문이 필요

import java.util.Scanner;

public class SwitchSeason {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("계절을 입력하세요 : ");
        String season = scanner.nextLine();

        switch (season){

            case "spring" :
            case "SPRING" :
                System.out.print("꽃이 피는 봉이 왔어요");
                break;
            case "SUMMER" :
            case "summer" :
                System.out.print("무더운 여름입니다");
                break;
            case "fall" :
            case "FALL" :
            case "autumn" :
            case "AUTUMN" :
                System.out.print("쓸쓸한 가을 입니다");
                break;
            case "winter" :
            case "WINTER" :
                System.out.print("아직 추운 겨울입니다");
                break;
            default:
                System.out.print("계절을 잘못 입력했습니다");

        }

    }

}
