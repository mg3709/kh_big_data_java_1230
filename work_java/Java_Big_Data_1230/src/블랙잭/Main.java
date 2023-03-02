package 블랙잭;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n : ");
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            int n = scanner.nextInt();
            if(n >= 3 && n <= 100){
                n += n;
                list.add(n);
            }
        }
        for(Integer e : list){
            System.out.println(e);
        }
        System.out.print("m : ");
        int m = scanner.nextInt();
        if(m >= 10 && m <= 3000000){
            list2.add(m);
        }
        for(Integer e : list2){
            System.out.println(e);
        }
    }
}
