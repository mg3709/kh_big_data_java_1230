package 구간합구하기;

import java.util.Scanner;

public class SumEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = scanner.nextInt();
        System.out.print("합 입력 : ");
        int m = scanner.nextInt();

        int[] num = new int[n];
        int[] sum = new int[n + 1];

        for(int i = 0; i < n; i++){
            num[i] = scanner.nextInt();
            sum[i + 1] += num[i] + sum[i];
        }
        for(int i = 0; i < m; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(sum[b] - sum[a - 1]);
        }
    }
}
