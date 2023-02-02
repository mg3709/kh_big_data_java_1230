package 큐에제2번;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//명령 이력 조회
public class QueueEx2 {
    final static int MAX_SIZE = 10;
    Queue<String> queue = new LinkedList<>();

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        QueueEx2 history = new QueueEx2();
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다");
        while(true){
            System.out.print("$ ");
            String cmd = scanner.next().trim();// 입력받은 문자열의 앞/뒤의 공백 제거

            if(cmd.equalsIgnoreCase("q")) {
                System.out.print("프로그램 종료");
                System.exit(0);
            }else if(cmd.equalsIgnoreCase("help")){
                System.out.println("help - 도움말을 보여 줍니다");
                System.out.println("q/Q - 프로그램 종료");
                System.out.println("history - 최근 입력한 명령어들 " + MAX_SIZE + " 개 보여줍니다");
            }else if(cmd.equalsIgnoreCase("history")){
                history.save(cmd);
                int cnt = 0;
                for(String e : history.queue){
                    cnt++;
                    System.out.println(cnt + " " + e);
                }
            }else{
                history.save(cmd);
                System.out.println(cmd);
            }
        }
    }
    void save(String cmd){
        queue.offer(cmd);
        if(queue.size() > MAX_SIZE)queue.remove();
    }
}
