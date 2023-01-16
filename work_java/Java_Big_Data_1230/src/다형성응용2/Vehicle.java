package 다형성응용2;

public class Vehicle {
    public void run(){
        System.out.println("자동차가 달립니다");
    }
}
class SportsCar extends Vehicle{
    @Override//Vehicle클래스의 메소드와 완전히 동일해야 오버라이딩 가능
    public void run(){
        System.out.print(" 스포츠카가 달립니다");
    }
}
class Bus extends Vehicle{
    @Override
    public void run(){
        System.out.print(" 버스가 달립니다");
    }
}
class Truck extends Vehicle{
    @Override
    public void run(){
        System.out.print(" 트럭이 달립니다");
    }
}