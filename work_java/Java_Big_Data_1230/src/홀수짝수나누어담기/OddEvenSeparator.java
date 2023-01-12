package 홀수짝수나누어담기;

//7개 정수를 입력받음(배열 생성 필요)
//정수 입력 : 1 2 3 4 5 6 7
//홀수 : 1 3 5 7
//짝수 : 2 4 6

import java.util.Scanner;

public class OddEvenSeparator {

    int[] inputArr = new int[7];
    int[] oddArr = new int[7];
    int[] evenArr = new int[7];

    int evenIdx = 0;
    int oddIdx = 0;


    //7개의 정수를 입력받음
    void inputArray() {

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < inputArr.length; i++){

            System.out.print("정수 입력 : ");
            inputArr[i] = scanner.nextInt();

        }

    }


    //홀수 / 짝수 나누어 담기
    void separatorArray(){

        for(int e : inputArr){

            if(e % 2 == 0)oddArr[oddIdx++] = e;
            else evenArr[evenIdx++] = e;

        }

    }

    //홀수 / 짝수 배열 출력
    void printArray(){

        System.out.print("홀수 : ");
        for(int i = 0; i < oddIdx; i++)System.out.printf("%2d",evenArr[i]);

        System.out.println();

        System.out.print("짝수 : ");
        for(int i = 0; i < evenIdx; i++)System.out.printf("%2d",oddArr[i]);

    }

}
