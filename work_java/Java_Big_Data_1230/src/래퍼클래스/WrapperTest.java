package 래퍼클래스;
//래퍼클래스란 ? 기본타입을 객체타입으로 변환 시켜 주는것
//필요한 이유 ? 컬렉션 프레임워크에서 사용되는 자료형은 모두 객체 타입이므로 기본타입을 사용할 수 없음
//객체타입으로 사용하는 이유는 일반화 프로그램을 위해서이며, 일반화 프로그램은 여러가지 다양한 데이터
//여러가지 다양한 데이터 타입에 대해서 동일한 자료구조로 관리ㅏ기 위해서...
public class WrapperTest {
    public static void main(String[] args) {
        Integer num = new Integer(17);//박싱
        int n = num.intValue();//언박싱
        System.out.println(n);

        Character ch = 'x';//Character ch = new Character('x') : 오토박싱
        char c = ch; // char c = ch.charValue();
        System.out.println(c);
    }
}
