package 암호화;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//암호화키의 반복 : lovelove => love문자열을 입력받은 문자배열로 만듬, 문자배열의 길이는 4 (인덱스 : 0, 1, 2, 3)
//                 nice day
//a b c d e f g h i j k l m n o p q r s u v w x y z
//0 1 2 3 4 5 6 7 8 9 10 11 12 13
//만약에 결과가 음수가 나오면 해다값에서 26만큼 더해줌
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("평문 : ");
        String normal = scanner.nextLine();
        System.out.print("암호화 키 : ");
        String encrypt = scanner.next();

        char[] ch = encrypt.toCharArray();//암호화키를 문자배열로 변경
        char value = 0;//암호문을 만들기 위한 문자변수
        List<Character> vig = new ArrayList<>();

        for(int i = 0; i < normal.length(); i++){
            if(normal.charAt(i) == ' ')vig.add(' ');
            else{
                value = (char)(normal.charAt(i) - (ch[i % encrypt.length()] - 'a') - 1);
                if(value < 'a')value += 26;
                vig.add(value);
            }
        }
        for(Character e : vig)System.out.print(e);
    }
}
