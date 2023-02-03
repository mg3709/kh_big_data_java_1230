package 스레드예제8번;

import static java.lang.Thread.sleep;

//데몬 스레드 : 다른 스레드의 작업을 돕는 보조스레드 입니다. 다른 Thread가 모두 종료되면 자동으로 종료됩니다.
//Thread 를 start() 하기전에 setDemon(true) 설정만 하면 됨
public class ThreadEx8 {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();
        sleep(3000);
    }
}
class AutoSaveThread extends Thread{
    public void save(){
        System.out.println("작업 내용을 저장 함");
    }
    @Override
    public void run(){
        while(true) {
            try {
                sleep(3000);
            } catch (InterruptedException e) {

            }
            save();
        }
    }
}