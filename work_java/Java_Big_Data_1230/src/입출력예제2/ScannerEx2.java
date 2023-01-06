package 입출력예제2;

//Scanner 입력 : 키보드의 입력 원하는 데이터 타입으로 반환 받음

import java.util.Scanner;//두번째로 많이 사용되는 자바 API

public class ScannerEx2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        byte b = scanner.nextByte();//키보드입력을 byte형으로 반환
        short c = scanner.nextShort();
        char d = scanner.next().charAt(0);//문자열에서 첫번재 문자를 주출
        String s1 = scanner.next();//문자열을 공백 단위로 입력받음
        String s2 = scanner.nextLine();//문자열을 줄바꿈 기준으로 입력 받음

    }
}
