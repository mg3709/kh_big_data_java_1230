package 인터페이스활용;

public class CustomerTest {
    public static void main(String[] args){
        Customer cs = new Customer();
        Buy buyer = cs;//cutomer type의 cutomer참조변수를 buy 인터페이스형 buyer 참조변수에 대입하세요
        buyer.buy();//buyer는 buy인터페이스의 메소드만 호출 가능

        Sell sell = cs;//자동 형변환 일어남
        sell.sell();

        Customer customer1 = (Customer) sell;//다시 역으로 형변환
        customer1.buy();
        customer1.sell();
    }
}
