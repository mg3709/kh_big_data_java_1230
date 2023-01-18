package 암호체크;
//암호체크
//암호의 길이는 10 ~ 30자 사이(10 <= 30)
//암호에는 숫자, 소문자, 대문자, 특수문자가 포함되어야함
//특수문자는 (!, %, _, #, &, +, -, *, /)의 9개중 하나
//입력 받은 패스워드가 조건을 만족하면 "Good Password",만족하지 못하면 "Bad Password" 출력
//반복문을 사용하고 사용자가 "종료" 또는 "exit"를 입력하면 프로그램 종료

import java.util.Scanner;

public class PwdCheckMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PwdCheck pwdcheck = new PwdCheck();
        String pwd;//암호를 입력 받는 변수 생성



        while(true){
            System.out.print("암호 입력 : ");
            pwd = scanner.next();

            if(pwd.equals("종료") || pwd.equalsIgnoreCase("exit"))break;

            if(pwdcheck.validLength(pwd) == false){
                System.out.println("Bad Length password");
                continue;
            }
            if(pwdcheck.validNumber(pwd) == false){
                System.out.println("Bad Number password");
                continue;
            }
            if(!pwdcheck.validUpperAlphabet(pwd)) {
                System.out.println("Bad Upper Alphabet password");
                continue;
            }
            if(pwdcheck.validLowerAlphabet(pwd)) {
                System.out.println("Bad Lower Alphabet password");
                continue;
            }
            if(pwdcheck.validRex(pwd)) {
                System.out.println("Bad Rex password");
                continue;
            }
            System.out.println("Good password");
        }
    }
}
