package 스레드예제2번;

import static java.lang.Thread.sleep;

public class RunThread implements Runnable{
    @Override
    public void run() {
        int sum = 0;
        for(int i = 0; i < 10; i++){
            sum += i;
            System.out.println("" + Thread.currentThread() + sum);
        }
        System.out.println(Thread.currentThread() + "합계 : " + sum);
    }
}
