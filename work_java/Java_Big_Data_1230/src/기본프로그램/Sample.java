package 기본프로그램;// 패키지는 접근제한자(캡슐화)와 연관성이 있음

import java.util.Scanner;

//접근제한자 : public , protected, default, private
public class Sample {//클래스 이름을 지정, 클래스 이름은 관례상 첫자를 대문자로 사용

    //main 메소드는 프로그램의 시작 위치를 의미하며 JVM이 호출 됨
    //void는 메소드 실행 이후의 반환 타입 중 하나 입니다.
    //{} : 중괄호 : 클래스, 메소드 등의 범위를 결정
    //() : 소괄호 : 메소드의 매개변수를 넣는 곳
    //[] : 대괄호 : 배열 등을 정의 할 때 사용함

    public static void main(String[] args) {//static은 하나만 사용됨

        System.out.println("안녕하세요!!!");

    }
}