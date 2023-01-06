package 변수의생존범위;

//상수란? 변수와 마찬가지로 데이터를 저장할 수 잇는 메모리공간을 의미
//변수가 다른점은 프로그램이 실행되는 동안 값이 변경이 안됨
//자바에서 상수는 final 키워드로 정의하고 단, 한번만 값을 설정 할 수 있음

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args){

        final double taxRate = 0.10;//taxRate final통해 상수 고정값
        Scanner scanner = new Scanner(System.in);

        System.out.println("당신의 수입을 입력하세요: " );

        int income = scanner.nextInt();

        //taxRate = 0.09; ----> final로 taxRate 고정했기 때문에 값을 고정하는 코드는 오류
        System.out.println("당신의 내야할 세금은" + income * taxRate);

    }
}
