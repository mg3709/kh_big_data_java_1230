package 배수찾기;
//문제 : 정수 n과 수의 목록이 주어졌을 때, 목록에 들어있는 수다 n의 배수인지 아닌지 구하는 프로그램 작성
//입력 : 첫째줄에 n이 주어짐, 다음줄에 한줄에 한 개씩 목록에 들어있는 수가 주어짐( 0 ~ 10000 )
//출력 : 목록에 있는 수가 n의 배수인지 아닌지를 구한 후 아래처럼 출력
// 3 -> 주어진 수
// 1
// 7
// 99
// 321
// 777
// 0 -> 반복문에 대한 종료
// 1 is Not a multiple of 3
// 7 is Not a multiple of 3
// 99 is a multiple of 3
// 321 is a multiple of 3
// 777 is a multiple of 3

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultipleSearchEx {
    public static void main(String[] args) {
        //ArrayList 생성하기
        List<Integer> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("기준값 : ");
        //키보드 값 입력받기 ( 주어진 숫자 )
        int n = scanner.nextInt();
        int mul;//주어진값의 배수인지 아닌지 판별하기 위한 값을 입력받음

        while(true){//항상 참인 경우이므로 무한으로 반복하는 반복문, 이 경우는 반드시 탈출조건 필요
            mul = scanner.nextInt();

            if(mul == 0)break;

            list.add(new Integer(mul));//add 에 인덱스를 지정하지 않으면 마지막 위치에 저장됨
        }
        for(Integer e : list){

            if(e % n == 0)System.out.println(e + " is a multiple of " + n);
            else System.out.println(e + " is Not a multiple of " + n);

        }

        System.out.println("프로그램 종료");

    }
}
