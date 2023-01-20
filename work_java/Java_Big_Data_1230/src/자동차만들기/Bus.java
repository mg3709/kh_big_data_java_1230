package 자동차만들기;

public class Bus extends Car{

    Bus(String name){
        super(name);
        this.mileage = 5;
        this.speed = 150;
        this.gas = 100;
        this.seat = 20;
        count += seat;
    }

    @Override
    void Addition(boolean TF) {
    this.gas += 30;
    }
}
