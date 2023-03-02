package 소수판별하기;
//소수 : 1과 자기자신 이외에는 나누어 지지 않는 수
//소수 판별하기 :
//소수의 합 구하기 : 정수 값을 입력받아 입력받은 정수 값 미만의 소수의 합을 구하는 문제
//정수 입력 : 12
//결과 : 2 + 3 + 5 + 7 + 11 = 28
//문제를 푸는 방법 : 메소드를 호출하면서 호출 시 정수값을 입력해서 해당 정수가 소수이면 그 값을 반환
import java.util.Scanner;

public class PrimeEx1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int number = scanner.nextInt();
        int sum = 0;
        //반복문 수행 : 입력 받은 정수 미만의 값으로 메소드 호출(12 => 2 ~ 11)
        for(int i = 2; i < number; i++){

        }
        System.out.println("소수의 합 : " + sum);

    }

    //static 키워드로 선언되면 객체 생성시 안되고 클래스 생성시 단 한번 만들어짐
    //해당 메소드 수행 후 반환 값이 true/false 임
    //정수 값을 입력 받아 해당 정수가 소수인지 아닌지 판별 후 결과를 반환 함
    static int PrimeSum(int n) {
        boolean isPrime = true; //기본값을 소수로 정함
        for(int i = 2; i < n; i++){

            if(n % i == 0)isPrime = false;

        }
        if(isPrime)return  n;
        else return 0;
    }
}
