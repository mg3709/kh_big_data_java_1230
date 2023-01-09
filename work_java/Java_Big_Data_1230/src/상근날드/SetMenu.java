package 상근날드;

//상근날드 가게에서는 세트 메뉴를 판매 합니다
//햄버거는 3개 종류가 있고
//음료 2가지 종류가 있음
//입력은 총 5개의 값을 연속으로 입력 하는데 햄버거 3가지, 음료 2가지를 연속으로 입력
//햄버거 3가지 중 가잔 싼 메뉴 선택, 음료 2중 싼 것을 선택하고, 세트 메뉴이기 때문에 50원 할인
//총 세트메뉴의 금액을 구하는 문제

import java.util.Scanner;

public class SetMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] menu = new int[5];//5개의 정수로 구성된 배열 생성
        System.out.print("메뉴 입력 : ");// 햄버거 3개와 음료 2개의 가격을 연속으로 입력받음

        for(int i = 0; i < menu.length; i++){

            menu[i] = scanner.nextInt();//배열의 길이만큼 순회하게 하면서 값을 연속으로 입력받음
            System.out.print("메뉴입력 : ");
        }

        int minBurger = menu[0];//0 ~ 2 인덱스 사이의 햄버거 중 하나의 값을 기본값을 설정
        int minDrink = menu[3];//3 ~ 4 인덱스 사이의 음료 중 하나의 값을 기본값으로 설정

        //반복문을 순회하면서 햄버거 1개와 음료 1개중 제일 싼 메뉴를 선택 함
        for(int i = 0; i < menu.length; i++){

            if((i < 3) && (minBurger > menu[i]))minBurger = menu[i];
            if((i > 2) && (minDrink > menu[i]))minDrink = menu[i];

        }

        System.out.println("최종 가격 : " + (minBurger + minDrink - 50));

    }
}
