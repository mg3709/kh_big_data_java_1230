package 진수변환;



import java.util.Scanner;

public class Trans {
    public static void main(String[] args){
        final String[] str1 = {"000","001","010","011","100","101","110","111"};
        final String[] str2 = {"","1","10","11","100","101","110","111"};
        final int MAX_NUM = 333334;
        Scanner scanner = new Scanner(System.in);
        System.out.print("8진수 입력 : ");
        String eight = scanner.next();

        for(int i = 0; i < eight.length(); i++){
            if(eight.length() == 1 && eight.charAt(0) - '0' == 0){
                System.out.println("0");
                break;
            }
            if(i == 0){
                System.out.print(str2[eight.charAt(0) - '0']);
            }else{
                System.out.print(str1[eight.charAt(0) - '0']);
            }
        }
    }
}
