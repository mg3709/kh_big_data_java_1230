package 스트림예제7번;

import java.util.ArrayList;
import java.util.List;


public class StreamEx7 {
    public static void main(String[] args) {
        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(new TravelCustomer("안유진", 21, 100));
        customerList.add(new TravelCustomer("유나", 21, 100));
        customerList.add(new TravelCustomer("지수", 24, 80));
        customerList.add(new TravelCustomer("민지", 18, 90));
        System.out.println("고객 명단 순서대로 출력");
        // map을 이용해 고객 이름 가져오고 이를 순회하면서 출력
        customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
        // 고객이 지불한 금액을 가져오기 위해 mapToInt를 이용해 정수 변환
        int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.println("총 여행 비용 : " + total);

        System.out.println("== 20세 이상 명단 출력 ==");
        customerList.stream()
                .filter(c -> c.getAge() >= 20)
                .map(c -> c.getName())
                .sorted() // 중간 연산
                .forEach(s -> System.out.println(s));  // 최종 연산
    }
}

class TravelCustomer{
    String name;
    int age;
    int price;

    public TravelCustomer(String name,int age,int price) {
        this.name = name;
        this.age  = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
