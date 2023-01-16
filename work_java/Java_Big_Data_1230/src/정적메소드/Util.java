package 정적메소드;

import java.text.SimpleDateFormat;
import java.util.Date;

//고정된 값을 한곳에 몰아넣고 불러내어 사용

public class Util {
    public static String getCurrentDate(String fmt){
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return  sdf.format(new Date());
    }

    final static String DOMAIN = "192.168.0.1";
}
