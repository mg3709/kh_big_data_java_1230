package ContinueEx1;

public class ContinueEx {
    public static void main(String[] args) {
        for(int i=1;i <= 100;i++){

            if(i % 2 == 0) continue;//조건에 걸리면 아래쪽 문장은 동작안함

            System.out.println(i);


        }
    }
}
