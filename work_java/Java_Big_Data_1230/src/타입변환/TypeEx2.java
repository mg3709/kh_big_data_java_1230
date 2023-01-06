package 타입변환;

//진수 표현 : 16진수, 10진수, 8진수, 2진수

public class TypeEx2 {

    public static void main(String[] args){

        int var1 = 0b1010;  //2진수 = 10
        int var2 = 0206;  //8진수
        int var3 = 465;  //10진수
        int var4 = 0xB3;  //16진수

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);

    }
}
