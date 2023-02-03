package 스레드예제2번;
//Thread를 생성하는 방법 :
//-상속을 받는 방법 : (extends Thread) : 구현이 간편, 다른 상속을 받지 못함
//-Runnable 인터페이스로 구성 : 다른클래스의 상속을 받을 수 있음, Thread객체 만드는 과정이 필요
//-익명의 객체로 구현 : 클래스 생성이 없어 간편하게 구현 할 수 있음
//-익명의 객체를 람다식으로 구현
public class ThreadEx2 {
    public static void main(String[] args) {
        Thread th = new ControlThread();
        th.start();//내부적으로 run() 메소드가 호출됨

        Runnable runth = new RunThread();//수행해야할 작업내용을 포함하고 있지만 실제 Thread는 아님
        Thread run = new Thread(runth);
        Thread run2 = new Thread(runth);
        run.start();
        run2.start();

        //익명의 객체 생성
        Runnable task = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for(int i = 0; i < 10; i++){
                    sum += i;
                    System.out.println("" + Thread.currentThread() + sum);
                }
                System.out.println(Thread.currentThread() + "합계 : " + sum);
            }
        };
        Thread run3 = new Thread(task);
        run3.start();

        //익명의 객체를 람다식으로 생성
        Runnable task2 = () -> {//new Runnable() 생략
            int sum = 0;
            for(int i = 0; i < 10; i++){
                sum += i;
                System.out.println("" + Thread.currentThread() + sum);
            }
            System.out.println(Thread.currentThread() + "합계 : " + sum);
        };
        Thread run4 = new Thread(task2);
        run4.start();

        System.out.println("나는 메인입니다");
        System.out.println("나는 메인입니다");
        System.out.println("나는 메인입니다");
        System.out.println("나는 메인입니다");
    }
}
