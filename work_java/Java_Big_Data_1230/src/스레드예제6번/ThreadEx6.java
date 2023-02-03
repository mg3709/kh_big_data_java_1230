package 스레드예제6번;

import static java.lang.Thread.sleep;

//스레드의 안전한 종료 방법은 stop 플래그를 구현하는 방법과 interrupt()메소드를 사용하는 방법이 있습니다
//
public class ThreadEx6 {
    public static void main(String[] args) throws InterruptedException {
//        RunThread run = new RunThread();
//        run.start();
//        sleep(1000);
//        run.setStop(true);

        InterruptThread run2 = new InterruptThread();
        run2.start();
        sleep(1000);
        run2.interrupt(); //일시정지의 상태의 Thread에 Interrupt Exception 발생 시킴
    }
}
