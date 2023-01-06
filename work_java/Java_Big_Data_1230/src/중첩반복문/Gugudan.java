package 중첩반복문;

public class Gugudan {

    public static void main(String[] args){

        for(int i = 2;i < 10;i++){//행으로 취급된다

            System.out.printf("==== |%d 단| ==== \n",i);

            for(int j = 1;j < 10;j++){//열로 취급된다

                System.out.printf("%d X %d = %d  \n",i,j,(i*j));

            }

            System.out.println();

        }

    }

}
