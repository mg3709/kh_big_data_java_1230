package 인터페이스활용;
//디폴트메소드가 중복되는 경우 : 예외적으로 인터페이스 메소드
public interface Buy {
    void buy();
    default void order(){
        System.out.println("구매 주문");
    }
}
