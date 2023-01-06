package 주사위게임;

//주사위 2개를 던져서 합이 12이면 탈출하는 게임

public class RandomGame {
    public static void main(String[] args) {

        int rand1,rand2;
        int count = 0;

        while(true){

            count++;

            rand1 = (int)((Math.random() * 6) + 1);//랜덤함수는 실수형으로 값이 생성되므로 형변환 필요
            rand2 = (int)((Math.random() * 6) + 1);//0부터 시작되므로 *6에 +1을 해야한다

            if(rand1 + rand2 == 12){

                System.out.println("무인도를 " + count + "번 만에 탈출 합니다");
                break;

            }else{

                System.out.println("주사위의 합이 " + (rand1 + rand2) + "입니다");

            }

        }

    }

}
