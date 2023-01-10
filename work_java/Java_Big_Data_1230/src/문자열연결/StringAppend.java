package 문자열연결;

import java.util.Scanner;

//문자열 추가하기
//첫번째 문자열 출력 : Seoul
//두번째 문자열 출력 : Korea
//정수값 출력 : 2
//첫번째 문자열에서 입력 받은 정수 갯수만큼의 문자를 뒤에서 잘림, 두번째 사실
//vlkorea
//3을 입력하면 oulkorea
//힌트 1. substring(index) : 문자열의 시작 위치 부터 끝까지 잘라냄
//힌트 2. substring 메소드를 이용해 문자열 추출하기 전에 index계산이 필요
public class StringAppend {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 문자열 입력 : ");
        String fststr = scanner.next();

        System.out.print("두번째 문자열 입력 : ");
        String secstr = scanner.next();

        System.out.print("정수를 입력하세요 : ");
        int n = scanner.nextInt();
        int position = fststr.length() - n;
        String sub = fststr.substring(position);
        System.out.println(sub + secstr);
    }
}

