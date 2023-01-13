package 상속실습예제;

//인간(person)이라는 클래스 생성
// -age : 나이 특성을 가짐 (정수 값 사용, 게터/세터) - 몇살?
//-sleep : 잠자는 특성 (정수 값 사용, 게터/세터) - 몇시간 잠자는지?
//인간으로 부터 직장인을 생성
//-work : 몇 시간 일하는지? ( 정수, 게터/세터)
//인간으로부터 학생을 생성
//-study : 공부하는 특성 (1입력 "열심히", 2"적당히",3"놀면서")

import java.util.Scanner;

public class InheritanceEx1 {

    String name;
    int age;
    int sleep;
    int work;
    int study;

}

class Person extends InheritanceEx1{

    void People(String name){

        this.name = name;
        int age;
        int sleep;
        int work;
        String study;

    }

    public int getAge(){

        return age;

    }

    public int getSleep(){

        return sleep;

    }

    public int getWork(){

        return work;

    }

    public String getStudy(){

        String[] StudyStr = {"","열심히","적당히","놀면서"};
        return StudyStr[study];

    }

    public void setAge(){

        this.age = age;
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        age = scanner.nextInt();

    }

    public void setSleep(){

        this.sleep = sleep;
        Scanner scanner = new Scanner(System.in);
        System.out.print("수면시간을 입력하세요 : ");
        sleep = scanner.nextInt();

    }

    public void setWork() {

        this.work = work;
        Scanner scanner = new Scanner(System.in);
        System.out.print("일하는 시간을 입력하세요 : ");
        work = scanner.nextInt();

    }

    public void infoPeople(){

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("수면시간 : " + sleep);
        System.out.println("일하는시간 : " + work);
        System.out.println("공부하는 특성 : " + study);

    }
}
