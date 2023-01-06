package 입출력예제2;

//콘솔 입력에 대해서
//System.in.read() : 키보드 입력을 ASCII 코드값으로 읽어 들임

import java.io.IOException;

public class ScanerEx {
    public static void main(String[] args) {

        while (true) {//true를 쓰면 무한 반복 break 사용으로 탈출 가능

            try {

                int ketCode = System.in.read();

                System.out.println("ketCode : " + ketCode);

                if(ketCode == 'q'){

                    break;

                }

            } catch (IOException e) {

                e.printStackTrace();

            }

        }

    }

}