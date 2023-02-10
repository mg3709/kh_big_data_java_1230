package 직렬화연습2번;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SerialMenuWrite {
    static Map<String,CoffeeMenuInfo> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        menuWriter();
        selectMenu();
    }
    static void menuWriter(){
        map.put("Americano",new CoffeeMenuInfo("Americano",2500,"Coffee","그냥 커피"));
        map.put("Espresso",new CoffeeMenuInfo("Espresso",2500,"Coffee","진한 커피"));
        map.put("Latte",new CoffeeMenuInfo("Latte",4500,"Coffee","우유가 들어있어요"));
    }
    static void selectMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("메뉴를 선택하세요 : ");
        System.out.println("[1]메뉴 보기, [2]메뉴 추가, [3]종료 : ");
        int sel = scanner.nextInt();
        switch (sel){
            case 1:
                System.out.println("=========메뉴 보기===========");
                for(String e : map.keySet()){
                    System.out.println("메뉴 : " + map.get(e).getName());
                    System.out.println("가격 : " + map.get(e).getPrice());
                    System.out.println("분류 : " + map.get(e).getGroup());
                    System.out.println("설명 : " + map.get(e).getDesc());
                }
            case 2:
                String key = scanner.next();
                System.out.println("==========메뉴 추가==========");
                    if (map.containsKey(key)){
                        System.out.println("이미 메뉴가 있습니다");
                    }else{
                        System.out.print("가격 입력 : ");
                        int price = scanner.nextInt();
                        System.out.print("분류 입력 : ");
                        String group = scanner.next();
                        System.out.print("설명 입력 : ");
                        String desc = scanner.next();
                        map.put(key,new CoffeeMenuInfo(key, price, group, desc));
                    }
            case 3:
                System.out.println("메뉴를 종료 합니다, 내용을 파일에 저장합니다");
                FileOutputStream fos = new FileOutputStream("src/직렬화연습2번/Coffee.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(map);//객체를 직렬화해서 파일에 저장
                oos.flush();
                oos.close();
                break;
        }
    }
}
