package 스레드예제3번;

import java.awt.*;
import java.nio.channels.ScatteringByteChannel;

import static java.lang.Thread.sleep;

//sleep() : 실행중인 스레드를 일정 시간동안 대기 상태로 만듬
//(반복 수행에 대한 시간을 늦추거나 할 때 사용하거나, 인터럽트 예외처리를 위해서 사용)
public class ThreadEx3 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 10; i++) {
            toolkit.beep();//소리 나게하기
            try {
                sleep(3000);//3000의 시간마다 소리나게 하기
            } catch (InterruptedException e) {

            }
        }
    }
}