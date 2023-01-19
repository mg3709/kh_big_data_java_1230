package 인터페이스네트워크;

import java.util.Scanner;

public class InterfaceMainEx1 {
    public static void main(String[] args) {
        NetworkAdapter adapter = null;
        Scanner scanner = new Scanner(System.in);

        System.out.print("연결할 네트워클 선택해주세요 : [1]WiFi [2]5G [3]LTE : ");
        int num = scanner.nextInt();


        switch (num){
            case 1 :
              adapter = new WiFi("KT MegaPass");
              break;
            case 2 :
                adapter = new FiveG("SK Telecom");
                break;
            case 3 :
                adapter = new LTE("LG U+");
                break;

            default:
                System.out.println("네트워크를 잘못 선택하였습니다");
        }
        adapter.connect();
    }
}
