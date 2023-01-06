package 변수와데이터;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        int age = 100;//정수값을 저장할 수 있는 age라는 변수를 선언 변수를 선언하고 초기값으로 100을 대입
        double value = 0.0;//실수값을 저장할 수 잇는 value라는 변수를 선언하고 초기값을 0.0대입

        int num1, num2;//같은 타입으로 여러개의 변수를 선언 콤마(,)로 구분
        double num3 = 3.14;//실수 타입의 변수를 선언과 동시에 초기화

        int hour = 3;
        int minute = 5;

        System.out.println(hour + "시 " + minute + "분");

        NameCard namecard = new NameCard();
        namecard.name = "곰돌이사육사";
        namecard.age = 30;
        namecard.addr = "경기도 고양시";
        namecard.email = "mg3709@naver.com";
        namecard.phonenumber = "010-1111-1111";
        System.out.println(namecard.name + namecard.age + namecard.addr + namecard.email + namecard.phonenumber);


    }
}

//사용자 정의 자료형
class NameCard{
    String name;
    int age;
    String addr;
    String email;
    String phonenumber;
}
