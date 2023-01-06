package 변수의생존범위;

public class ScopeData {

    public static void main(String[] args){

        int value = 20;//지역 변수
        int m = 0;

        if(value > 10){

            m = m + (value - 10);

        }

        System.out.println(m);

    }

}
