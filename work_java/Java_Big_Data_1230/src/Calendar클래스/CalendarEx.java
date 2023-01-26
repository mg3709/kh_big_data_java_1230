package Calendar클래스;

import java.time.Month;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

//Calendar 클래스는 추상클래스이므로 객체 생성없이 사용, 날짜와 시간과는 달리 캘린더 표기번은 각 나라마다 상이하기 때문에
//정적메소드인 getInstance() 메소드를 이용해서 운영체제의 시간 기준의 정보를 가져옴, 포함된 필드도 전부 클래스 변수
public class CalendarEx {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        System.out.println(now.get(Calendar.YEAR));
        System.out.println(now.get(Calendar.MONTH) + 1);
        System.out.println(now.get(Calendar.DAY_OF_WEEK));
        System.out.println(now.get(Calendar.DAY_OF_MONTH));
        System.out.println(now.get(Calendar.YEAR));
        System.out.println(now.get(Calendar.AM_PM));
        System.out.println(now.get(Calendar.HOUR));
        System.out.println(now.get(Calendar.YEAR));
        System.out.println(now.get(Calendar.SECOND));
        // yyyy년MM월dd HH시mm분ss초 : Calendar 클래스를 이용해서...
    }
}
