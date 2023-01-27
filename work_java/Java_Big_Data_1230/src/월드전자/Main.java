package 월드전자;
import java.util.Scanner;
//첫번째 : 고정비용
//두번째 : 가변비용
//세번째 : 판매금액
//손익분기점을 달성 할 수 없으면 -1
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        System.out.print("고정비용 : ");
        int fCost = scanner.nextInt();
        System.out.print("가변비용 : ");
        int vCost = scanner.nextInt();
        System.out.print("가격 : ");
        int price = scanner.nextInt();

        if(vCost >= price){
            System.out.println("-1");
            return;
        }
        while(true){
            if(cnt > fCost / (price - vCost))
                break;
            cnt++;
        }
        System.out.println(cnt);
    }
}
