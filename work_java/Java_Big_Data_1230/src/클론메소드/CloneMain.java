package 클론메소드;

public class CloneMain {
    public static void main(String[] args) {
        Member mem1 = new Member("1234567","곰돌이사육사","121212",30,true);
        Member mem2 = mem1;

        mem2.age =300;
        mem2.name = "Tiger";

        System.out.println("name : " + mem1.name);
        System.out.println("name : " + mem1.age);
        System.out.println("name : " + mem2.name);
        System.out.println("name : " + mem2.age);
    }
}
