package Math클래스;
//Math 클래스의 모든 메소드는 메소드 이므로 객체를 생성하지 않고 바로 사용함
//random() : 0.0 ~ 1.0 미만의 임의이 double형 값을 생성해서
//7자리의 로또 번호 생성하기
//7개의 배열을 만들고 첫번째 부터 6번째는 0 ~ 50 사이의 임의의 수 생성 후 대입
//마지막 7번째는 50 ~ 100 사이의 임의의 수를 만들어 대입하고 한번에 출력
public class MathMainEx {
    public static void main(String[] args) {
//        int[] lotto = new int[7];
//        for(int i = 0; i < 6; i++){
//            lotto[i] = (int)(Math.random() * 51);
//        }
//        lotto[6] = (int)(Math.random() * 51) * 50;
//        for(int e : lotto)System.out.println(e + " ");

        //abs() 메소드 : 절대값 구하기, 양수면 양수, 음수면 양수
//        System.out.println(Math.abs(10));
//        System.out.println(Math.abs(-10));
//        System.out.println(Math.abs(-3));

        //floor() : 소수점 이하를 무조건 날림
        //ceil() : 소수점 이하가 있으면 무조건 울림
        //round() : 반올림
        System.out.println(Math.floor(10.999));
        System.out.println(Math.floor(10.001));
        System.out.println(Math.floor(10.5));
        System.out.println(Math.ceil(10.999));
        System.out.println(Math.ceil(10.001));
        System.out.println(Math.ceil(10.5));
        System.out.println(Math.round(10.001));
        System.out.println(Math.round(10.5));
        System.out.println(Math.round(10.499999999999));


        System.out.println(Math.max(11, 9.999));
        System.out.println(Math.min(11, 9.999));

        System.out.println(Math.pow(2, 5));//2 5제곱
    }
}
