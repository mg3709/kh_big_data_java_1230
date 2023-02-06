package 더하기싸이클;

//입력받은 수가 더하기 사이클의 조건을 수행하고 몇번만에 입력한 수와 같은 값으로 돌아오는지 확인하는 문제
//26 -> 10의 자리의 (20)수와 1의 자리(6)을 분리해서 더함 -> 2 + 6 = 8
//입력받은 수의 1의 자리 수와 계산된 수의 1의 자리수로 다시 연산한다 -> 68
//--------- 1Cycle-----------
//68 -> 6 + 8 = 14
//계산된 수는 85
//----------2Cycle-----------
//84 -> 8 + 4 = 12
//계산된 수는 42
//----------3Cycle-----------
//42 -> 4 + 2 = 6
//계산된 수는 26
//----------4Cycle-----------
import java.util.Scanner;

public class SumEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in);
        int sumNumber = 0;//입력받은 수의 10의자리와 1의자리를 분리해서 더함
        int newNumber = 0;//새롭게 만들어지는 수
        int cnt = 0;//사이클 횟수 누적하는 수

        System.out.print("입력 : ");
        int input = scanner.nextInt();
        int num = input; // 입력 받은 값이 변경되는 걸 막기 위해 임시 값을 만듬
        while(true){
            sumNumber = (num / 10) + (num % 10);//입력값을 10의 자리와 1자리로 분리해서 더함
            newNumber = (num % 10) * 10 + (sumNumber % 10);//입력값의 1의자리 + 계산된 값의 1의자리를 더함
            cnt++;
            System.out.println("=========" + cnt + "Cycle =======");
             if(newNumber == input)break; //더하기 조건에 따라 1Cycle 순회 후 입력 받은 값과 비교
            num = newNumber; //순회를 위해 만들어진값을 순회용 변수에 대입
        }
        System.out.println(cnt);
    }
}
