package 저항;

import java.util.Scanner;

//전자 제품에서는 저항이 들어간다. 처음 색 2 개는 저항의 값, 마지막은 곱해야 하는값
//색 : black,brown,red,orange.yellow,green,blue,violet,grey,white
//값 : 0,1,2,3,4,5,6,7,8,9
//곱 : 1, 10, 100, 1,000, 10,000, ....
//입력 : yellow violet red
//결과 : 4,700
//입력 : orange red blue
//결과 : 32,000,000
//입력 : white white white
//결과 : 99,000,000,000
public class ResistanceEx {
    public static void main(String[] args) {
        //컬러값에 대한 문자열 배열생성, 문자열을 비교해서 인덱스를 찾기위해
        Scanner scanner = new Scanner(System.in);
        String color[] = {"black","brown","red","orange","yellow",
                "green","blue","violet","grey","white"};

        System.out.print("색상을 입력해주세요 : ");
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.next();
        int mul = 0;
        int num = 0;
        int th = 0;

        for(int i = 0; i < color.length; i++){
            if(str1.equals(color[i])){
                mul = i;
            }if(str2.equals(color[i])){
                num = i;
            }if(str3.equals(color[i])){
                th = i;
            }
        }
        //Math.pow(10, 지수)
        System.out.println(((mul * 10) + num) * ((int)Math.pow(10,th)));
    }
}
