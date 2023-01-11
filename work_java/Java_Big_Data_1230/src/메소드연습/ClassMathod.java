package 메소드연습;

import java.util.Scanner;

//메소드 이름 규칙 : 변수 만드는 규칙과 동일 (새/소문자,_, $, 숫자 사용가능(숫자가 맨앞에 오면 안됨))
//camel 표기법 사용
//접근제한자 반환타입 메소드이름(매개변수 목록){ 구현부; return;}
public class ClassMathod {
    public static void main(String[] args) {

        Sample sample = new Sample();//클래스내에 생성자가 없으면 기본 생성자가 호출됨
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수값을 입력 : ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();



        int rst = sample.sum(100, 200);
        System.out.println(rst);

        int rst2 = sample.sum(n1, n2);//sum()은 매개변수와 반환값이 있는 메소드
        System.out.println(rst2);
        
        sample.say();//void 메소드 사용

        System.out.println(sample.sayStr());

    }
}

