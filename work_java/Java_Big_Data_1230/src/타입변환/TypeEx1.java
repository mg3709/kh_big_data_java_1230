package 타입변환;

//타입 변환이란? 하나의 타입을 다른 타입으로 변경하는 것
//묵지적 형변환(Auto) : 컴파일러가 유리한 방향으로 형을 변경해주는 것(사용자가 조정하지않아도 형변환됨)
//명시적 형변환 : 개발자가 의도한대로 형변환을 하는 것
//메소드를 이용한 형변환 : Integer.parseInt(); 문자열을 정수 타입으로 변환
//Double.parseDouble : 문자열을 실수 타입으로 변경

public class TypeEx1 {

    public static void main(String[] args){

        int num1 = 1, num2 = 4;
        double rst1 = num1 / num2;// 문제가 발생하는 코드 (정수와 정수의 나눔을 실수형으로 나타낼수 없어 오류)
        double rst2 = (double)num1 / num2;//명시적 형변환 : 개발자가 의도한대로 형변환을 하는 것
        //명시적 형변환과 묵시적 형변환이 일어남

        double rst3 = 100 + 100.1;//묵시적 형변환

        System.out.println(rst1);
        System.out.println(rst2);
        System.out.println(rst3);

        String phonenumber = "01050049874";
        String name = "곰돌이사육사";

        Integer number = Integer.parseInt(phonenumber);//숫자외 다른문자 포함되어 있음면 오류
        double number2 = Double.parseDouble(phonenumber);

        System.out.println(number);
        System.out.println(number2);




    }
}
