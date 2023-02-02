package 스레드예제1번;
//multi Thread : 하나의 프로그램에서 여러가지 일을 동시에 수행하는것
public class ThreadEx1{
    public static void main(String[] args) {
        Thread th = new TestThread();
        th.start();

        int sum = 0;

        for(int i = 0; i <= 100; i++){
            sum += i;
            System.out.println("여기는 메인스레드 입니다 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합계 : " + sum);
    }
}
//Thread 만드는 법 : Thread Class 를 상속받는 방법이 있음 (좋은 방법이 아님)
class TestThread extends Thread{
    @Override
    public void run(){
        int sum = 0;
        for(int i = 0; i <= 100; i++){
            sum += i;
            System.out.println("여기는 테스트 스레드 입니다 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합계 : " + sum);
    }
}
