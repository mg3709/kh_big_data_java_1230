package 스레드예제2번;

public class ControlThread extends Thread{
    @Override
    public void run(){//Thread가 실행되는 부분
        int sum = 0;
        for(int i = 0; i < 10; i++){
            sum += i;
            System.out.println("" + Thread.currentThread() + sum);
        }
        System.out.println(Thread.currentThread() + "합계 : " + sum);
    }
}
