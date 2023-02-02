package 큐예제1번;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Queue : FIFO(First in First Out) 구조, LinkedList 구조를 사용하고 있으며, LinkedList 기능 중 큐 관련 기능으로 제한됨
//add(e) : 맨 뒤에 요소를 삽입 (중간 삽입 안됨) - 예외 발생
//offer(e) : 맨 뒤에 요소를 삽입 - true / false 반환
//remove() : 맨 앞의 요소 제거 - 예외 발생
//poll() : 맨 앞의 요소 제거 - 비어 있으면 null 반환
//element() : 맨 앞의 요소를 읽어 옴 - 예외 발생
//peek() : 맨 앞의 요소를 읽어 옴 - 큐가 비어 있으면 null
public class QueueEx1 {
    public static void main(String[] args) {
        Queue<Message> msg = new LinkedList<>();
        msg.offer(new Message("mail","카즈하"));
        msg.add(new Message("SMS","안유진"));
        msg.offer(new Message("Kakao","윈터"));

        while(!msg.isEmpty()){
            Message msg1 = msg.poll();//큐에서 한개의 메시지를 꺼냄(맨앞)
            switch (msg1.command){
                case "mail":
                    System.out.println(msg1.to + "에게 메일을 보냅니다");
                    break;
                case "SMS":
                    System.out.println((msg1.to + "에게 문자를 보냅니다"));
                    break;
                case "Kakao":
                    System.out.println(msg1.to + "에게 카톡을 보냅니다");
                    break;
            }
        }
    }
}
class Message{
    String command;
    String to;

    public Message(String command, String to){
        this.command = command;
        this.to = to;
    }
}
