package 자동차만들기;

public class Sedan extends Car{

    Sedan(String name){
        super(name);
        this.mileage = 12;
        this.speed = 200;
        this.gas = 45;
        this.seat = 4;
        count += seat;
    }

    @Override
    void Addition(boolean TF) {
        seat += 1;
        count += 1;
    }
}
