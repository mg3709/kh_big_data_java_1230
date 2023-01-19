package 인터페이스코코아톡;

import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {
        CocoaTok cocoaTok = new CocoaTok("2EN1");

        cocoaTok.writeMsg("오늘 춥죠??");
        NetAdapter adapter;

        Scanner scanner = new Scanner(System.in);
        System.out.print("네트워크 : [1]WiFi [2]5G : ");
        int sel = scanner.nextInt();

        if(sel == 1){
            adapter = new WiFi();

        }else{
            adapter = new FiveG();
        }
        cocoaTok.sendMsg(adapter);
    }
}
