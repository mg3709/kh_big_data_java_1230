package 자동차만들기;

import java.util.Scanner;

import static 자동차만들기.Car.count;

//기본 설정
//        - 기름값은 1리터당 2000원
//        - 연비란? 리터당 주행거리를 의미 합니다.
//
//        - 처음 출발시 연료통에는 기름이 없는 상태 입니다.
//
//        ### 기능 구현
//
//        - 이동 지역을 선택 하세요 (1. 부산, 2. 대전, 3. 강릉, 4. 광주)
//        - 이동할 승객 수를 입력 하세요 ( 1 ~ 100 사이)
//        - 이동 차량을 선택 하세요. (1. 스포츠카, 2.승용차, 3번 버스)
//        - 부가 기능의 ON/OFF 를 선택 하세요.
//
//        ### 결과 출력
//
//        - 이동에 필요한 총 비용 산출(정수표시) :  (단, 이동 횟수는 편도만 계산하면 됩니다.)
//        - 주유 횟수(정수표시) : ****
//        - 총 시간 계산 ( 시간단위로 표시하되 소수점 이라 2자리까지 표시)
public class CarMain {

    public static void main(String[] args) {
        int local = 0;
        int people = 0;
        int witchCar = 0;
        int add;
        Car car = null;
        //부산 400km, 강릉 200km, 대전 150km,  광주 300km
        Scanner sc = new Scanner(System.in);
        System.out.print("이동 지역을 선택 하세요 [1]부산, [2]대전, [3]강릉, [4]광주 : ");
        local = sc.nextInt();
        System.out.print("이동할 승객 수를 입력 하세요 : ");
        people = sc.nextInt();
        System.out.print("이동 차량을 선택 하세요 [1]스포츠카 [2]승용차 [3]버스 : ");
        witchCar = sc.nextInt();
        System.out.print("부가기능 여부를 선택해주세요[1]O [2]X : ");
        add = sc.nextInt();

        while (count < people) {
            switch (witchCar) {
                case 1:
                    car = new SportsCar("부가티");
                    if (add == 1)
                        car.Addition(true);
                    break;
                case 2:
                    car = new Sedan("아반떼");
                    if (add == 1)
                        car.Addition(true);
                    break;
                case 3:
                    car = new Bus("타요");
                    if (add == 1)
                        car.Addition(true);
                    break;
                default:
                    break;
            }
        }
        car.GetInfo(local);
    }
}