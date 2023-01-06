package 회원정보;

public class MemberMain {
    public static void main(String[] args) {

        MemberInfo memberinfo = new MemberInfo();//MemberInfo 클래스를 객체로 만듬
        memberinfo.setName();//이름을 저장하는 메소드 호출
        memberinfo.setAge();//나이를 저장하는 메소드 호출
        memberinfo.setGender();//성별을 저장하는 메소드 호출
        memberinfo.setJobs();
        memberinfo.viewInfo();

    }
}
