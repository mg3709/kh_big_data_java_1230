package 자동차만들기;

public class SportsCar extends Car{

    SportsCar(String name) {
        super(name);
        this.mileage = 8;
        this.speed = 250;
        this.gas = 30;
        this.seat = 2;
        count += seat;
    }

    @Override
    void Addition(boolean TF) {
        this.speed *= 1.2;
    }
}
