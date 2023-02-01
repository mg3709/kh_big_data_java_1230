package 클래스정렬연습문제;

import java.util.Comparator;

public class StudentSort implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.score == o2.score) return 0;
        else if(o1.score < o2.score)return 1;
        else return -1;
    }
}
