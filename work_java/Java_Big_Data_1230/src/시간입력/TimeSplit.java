package 시간입력;
//입력 : 23:5:5 (24시간제로 시간을 콜론(:) 기준으로 입력)
//출력 : 오후 11시 05분 03초


import java.util.Scanner;

public class TimeSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("시간을 입력하세요 : ");
        String time = scanner.next();

        String[] splitTime = time.split(":");
        int hour = Integer.parseInt(splitTime[0]);
        int minute = Integer.parseInt(splitTime[1]);
        int second = Integer.parseInt(splitTime[2]);

        if(hour > 12){

            hour -= 12;
            System.out.printf("오후 %2d시 %2d분 %2d초",hour,minute,second);

        }else{

            System.out.printf("오전 %2d시 %2d분 %2d초",hour,minute,second);

        }

    }
}
