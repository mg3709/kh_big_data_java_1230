package 에어컨만들기;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AriConMain {
    public static void main(String[] args) throws InterruptedException {
        AirCon aircon = new AirCon();
        Scanner scanner = new Scanner(System.in);//에어컨을 켜기위해 콘솔 입력

        int elapsedTime = 0;//경과 시간을 계산하기 위한 변수
        boolean isSetTemp = false;//온도가 변경되어야할 조건 확인
        System.out.print("에어컨을 켜시겠습니까? (yes/no) : ");
        String isOn = scanner.next();//에어컨을 켜기 위한 문자열을 입력 받음

        if(isOn.equalsIgnoreCase("yes")){
            aircon.setPower(true);
            aircon.setAirconState();//온도와 바람세기를 설정하고 설정에 따라 쿨러나 히터 값 변경
            while(true){
                sleep(10);// 1초
                elapsedTime++;

                switch(aircon.getWindStep()){
                    case 1 : if(elapsedTime >= 60) isSetTemp = true;break;
                    case 2 : if(elapsedTime >= 30) isSetTemp = true;break;
                    case 3 : if(elapsedTime >= 20) isSetTemp = true;break;
                    default: if(elapsedTime >= 61) isSetTemp = true;
                }
                if (isSetTemp) {
                    if(aircon.isHeater())aircon.setCurrTemp(1);
                    if(aircon.isCooler())aircon.setCurrTemp(-1);
                    aircon.airConInfo();
                    isSetTemp = false;
                    elapsedTime = 0;
                }

                if(aircon.getCurrTemp() == aircon.getSetTemp()){
                    System.out.println("에어컨을 종료 합니다");
                    break;
                }
            }
        }
    }
}
