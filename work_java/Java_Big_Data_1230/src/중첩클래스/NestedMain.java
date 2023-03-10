package 중첩클래스;
//중첩 클래스란 ? 하나의 클래스 내부에 선언된 또 다른 클래를 의미
//일반적으로 여러 클래스와 관계를 맺는 겨우 독립적으로 클래스를 선언함
//특별한 경우 특정 클래스와 관계를 맺는 클래스를 내부에 선언 하기도함
// - 내부 클래스에서 외부 클래스 멤버의 손쉬운 접근 가능
// - 클래스를 논리적으로 묶어서 표현함으로써, 코드의 캡슐화 증가
// - 코드의 복잡성을 줄일 수 있음
public class NestedMain {
    public static void main(String[] args){
        A a = new A();//먼저 외부클래스를 생성한 후 내부 클래스 생성해야함
        A.B b = a.new B();
        b.testMethod();

        OutClass outClass = new OutClass();
        outClass.usingClass();
    }
}
class A{
    class B{
        void testMethod(){
            System.out.println("중첩 클래스의 메소드입니다");
        }
    }
}