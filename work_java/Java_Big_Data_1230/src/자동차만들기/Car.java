package 자동차만들기;

public abstract class Car {
    int speed;
    int gas;
    int mileage;
    int seat;
    String name;
    static int count = 0;
    final int []distance = {0,400,200,150,300}; //(1. 부산, 2. 대전, 3. 강릉, 4. 광주)
    public Car(String name){
        this.name = name;
    }

    abstract void Addition(boolean TF);
    public void GetInfo(int area){
        System.out.println("================= 차량 정보 ===================");
        switch (area){
            case 1 :
                System.out.println(name);
                System.out.println(distance[1] / mileage  * 2000 + "원");
                System.out.println(distance[1] / gas + "번");
                System.out.printf("%.2f시간\n",(double) distance[1] / speed);
                break;
            case 2 :
                System.out.println(name);
                System.out.println(distance[2] / mileage * 2000 + "원");
                System.out.println(distance[2] / gas + "번");
                System.out.printf("%.2f시간\n",(double) distance[2] / speed);
                break;
            case 3 :
                System.out.println(name);
                System.out.println(distance[3] / mileage * 2000 + "원");
                System.out.println(distance[3] / gas + "번");
                System.out.printf("%.2f시간\n",(double) distance[2] / speed);
                break;
            case 4 :
                System.out.println(distance[4] / mileage * 2000 + "원");
                System.out.println(distance[4] / gas + "번");
                System.out.printf("%.2f시간\n",(double) distance[2] / speed);
                break;
        }

    }

}