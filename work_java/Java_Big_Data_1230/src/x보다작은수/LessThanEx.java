package x보다작은수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//문제 : 정수 n개로 이루어진 배열 A 와 정수 x 가 주어진다, 이때 A에서 x보다 작은 수를 모두 출력
// 10 5 => 배열의 길이와 주어진 수
// 1 10 4 9 2 3 8 5 7 6
//결과 : 1 4 2 3
public class LessThanEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        System.out.print("배열의 개수 : ");
        int n = scanner.nextInt();

        System.out.print("비교 값 : ");
        int x = scanner.nextInt();

        for(int i = 0; i < n; i++){
                list.add(scanner.nextInt());
                if(list.get(i) < x)System.out.println(list.get(i) + " ");
        }
    }
}
