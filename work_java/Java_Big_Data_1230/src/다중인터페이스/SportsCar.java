package 다중인터페이스;

public class SportsCar extends Car implements AirCon, AutoDrive{
    private boolean isAirCon;//on/off
    private int setTemp;
    private boolean isAutoDrv;
    private boolean isTurbo;

    public SportsCar(boolean isAirCon, int setTemp, boolean isAutoDrv, int speed, String color, String year, boolean isTurbo)
    {
        this.isAirCon = isAirCon;
        this.setTemp = setTemp;
        this.isAutoDrv = isAutoDrv;
        this.speed = speed;
        this.color = color;
        this.year = year;
        this.isTurbo = isTurbo;
    }
    public void viewInfo(){
        String airConStr = (isAirCon) ? "ON" : "OFF";
        String autoStr = (isAutoDrv) ? "ON" : "OFF";
        String turboStr = (isTurbo) ? "ON" : "OFF";
        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println("연도 : " + year);
        System.out.println("에어컨 : " + airConStr);
        System.out.println("온도 : " + autoStr);
        System.out.println("자율주행 : " + autoStr);
        System.out.println("터보 모드 : " + turboStr);

    }
    @Override
    public void airConOn() {
        System.out.println("에어컨을 킵니다");
    }

    @Override
    public void airConOff() {
        System.out.println("에어컨을 끕니다");
    }

    @Override
    public void setAirConTemp(int temp) {
        System.out.println("온도를" + temp + "로 설정합니다");
    }

    @Override
    public void autoDrvOn() {
        System.out.println("자율주행을 시작합니다");
    }

    @Override
    public void autoDrvOff() {
        System.out.println("자율주행을 종료합니다");
    }
}
