package 스레드예제4번;
//join() : 다른 스레드가 종료 될때까지 기다렸다가 실행해야 하는 경우 사용
public class ThreadEx4 {
    public static void main(String[] args) {
        sumTh sumTh = new sumTh();
        sumTh.start();
        try {
            sumTh.join(100);//sumTh 가 종료 될때까지 main 이 대기하고 있음 (기다릴 시간을 지정할 수도 있음)
        }catch (InterruptedException e){

        }
        System.out.println("합 : " + sumTh.getSum());
    }
}
class sumTh extends Thread{
    private long sum;

    public void setSum(long sum){
        this.sum = sum;
    }
    public long getSum(){
        return sum;
    }

    @Override
    public void run(){
        for(int i = 0; i < 100; i++){
            sum += 1;
            try{
                sleep(1);
            }catch (InterruptedException e){

            }
        }
    }
}
