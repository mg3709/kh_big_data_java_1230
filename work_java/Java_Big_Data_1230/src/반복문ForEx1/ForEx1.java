package 반복문ForEx1;

//for 반복문 : for(초기식; 조건식; 증감식){ 반복 수행 구간 }


import java.util.Scanner;

public class ForEx1 {

    public static void main(String[] args) {

//        for(int i = 1; i <= 100; i++){
//
//            System.out.printf("%4d", i);//4칸을 잡고 오른쪽으로 정렬
//
//            if (i % 10 == 0){
//
//                System.out.println();
//
//            }
//
//        }

//        int i = 1;
//
//        while(true){
//
//            System.out.printf("%4d", i);
//            if(i % 10 == 0){
//
//                System.out.println();
//
//            }
//            if(i == 100)break;
//            i++;
//
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력 하세요 : ");
        int number = scanner.nextInt();
        int result = recursiveFunc(number);

        System.out.println(result);

    }

    public static int recursiveFunc(int n){

        if(n == 1)return 1;
        return n + recursiveFunc(n - 1);

    }

}
