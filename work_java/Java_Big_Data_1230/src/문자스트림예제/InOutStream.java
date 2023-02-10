package 문자스트림예제;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class InOutStream {
    public static void main(String[] args) throws IOException {
        TreeSet<Student> set = new TreeSet<>();
        FileInputStream fis = new FileInputStream("src/문자스트림예제/문자스트림예제.txt");
        Scanner scanner = new Scanner(fis);

        while(scanner.hasNextLine()){
            String str = scanner.nextLine();
            String[] arr = str.split(" ");
            int fir = Integer.parseInt(arr[1]);
            int sec = Integer.parseInt(arr[2]);
            int third = Integer.parseInt(arr[3]);

            set.add(new Student(arr[0],fir,sec,third, fir + sec + third));
        }
        for(Student e : set){
            System.out.println("이름 : " + e.getName() + " //" + " 총점 : " + e.getTotal());
            System.out.println("============================");
        }
    }
}
class Student implements Comparable<Student>{
    String name;
    int fir;
    int sec;
    int third;
    int score;

    public Student(String name, int fir, int sec, int third, int score) {
        this.name = name;
        this.fir = fir;
        this.sec = sec;
        this.third = third;
        this.score = score;
    }
    int getTotal(){
        return fir + sec + third;
    }
    String getName(){
        return name;
    }

    @Override
    public int compareTo(Student o1) {
        if(this.score == o1.score){
            return this.name.compareTo(o1.name);
        }
        return o1.score - this.score;
    }
}