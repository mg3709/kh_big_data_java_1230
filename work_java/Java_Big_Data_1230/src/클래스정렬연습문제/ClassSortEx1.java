package 클래스정렬연습문제;

import java.util.Scanner;
import java.util.TreeSet;

//학생의 수를 입력받기
//학생의 수만큼 객체를 생성하여 정보를 입력(이름, 성적, 학번)
//학생의 성적이 높은 순으로 결과를 표시하고 성적이 같으면 학번순으로 정렬
//그리고 출력시 등수가 표기 되도록 할 것
//[입력 예시]
//학생 수 입력 : 3
//안유진 99 2020301
//정국 87 202302
//채연 88 2020303
//[출력 예시]
//=============학생 성적 출력=============
//---------------------------------
//석차 성적 이름 학번
//--------------------------------
// 1  99  안유진  202301
// 2  88  채연   202303
public class ClassSortEx1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 수 입력 : ");
        int count = scanner.nextInt();
        TreeSet<Student> ts = new TreeSet<>(new StudentSort());//정렬 조건에 대한 객체를 넣어줌
        int cnt = 0;

        for(int i = 0; i < count; i++) {
            ts.add(new Student(scanner.next(), scanner.nextInt(), scanner.nextInt()));
        }

        System.out.println("==== 학생 성적 출력 ====");
        System.out.println("----------------------");
        System.out.println("석차   이름   성적   학번");
        System.out.println("----------------------");
        for(Student e : ts) {
            System.out.println(++cnt + "   " + e.name + "   " + e.score + "   " + e.num);
        }
        System.out.println("----------------------");
    }
}
