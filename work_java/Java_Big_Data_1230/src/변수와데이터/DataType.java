package 변수와데이터;

public class DataType {

    public static void main(String[] args){

        //byte num1 = 127;//byte형은 1byte크기이며 -128 ~ 127
        //byte num2 = -128;//표현범위 넘어가서 수가 뒤집힘

        //short num1 = 32767;
        //short num2 = -32768;

        //num1++;
        //num2--;

        //System.out.println(num1);
        //System.out.println(num2);

        double num1 = 0.1;

        for(int i=0; i < 1000; i++){

            num1 += 0.1;

        }

        System.out.println(num1);

    }

}
