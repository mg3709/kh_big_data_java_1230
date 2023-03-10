package TV만들기;

import java.time.ZoneOffset;

//Television 만들기
public class TV {
    private boolean isON;//전원 버튼, 접근 제한자는 private로 설정 (같은 클래스 내에서만 접근 가능)
    private int channel;//0 ~ 999
    private int volume;//0~100

    TV(){
        isON = false;
        channel = 10;
        volume = 10;
        System.out.printf("기본생성자 호출, 전원 : %b, 채널은 : %d, 볼륨 : %d\n", isON, channel, volume);
    }
    TV(boolean isOn, int chl, int vol){

        this.isON = isOn;
        channel = chl;
        volume = vol;

    }
    //외부에서 전원 ON/OFF 할 수 있는 기능을 제공(리모콘??)
    public void setON(boolean isON){

        this.isON = isON;
        String onOffstr = (isON) ? "ON" : "OFF";
        System.out.println("TV가 " + onOffstr + "되었습니다");

    }
    //외부에서 채널을 변경할 수 있는 기능을 제공
    public void setChannel(int chl){

        if(chl >= 0 && chl <= 999){

            channel = chl;
            System.out.println("채널을 " + channel + "로 변경하였습니다");

        }else{

            System.out.println("채널 설정 범위가 아닙니다");

        }

    }

    public void setVolume(int vol){

        if(vol >= 0 && vol <= 100){

            volume = vol;
            System.out.println("볼륨을 " + volume + "으로 변경 하였습니다");

        }else{

            System.out.println("볼륨 설정 범위가 아닙니다.");

        }

    }

    public void getTV(){

        String onOffstr = (isON)? "ON" : "OFF";
        System.out.println("========== TV 정보 ================");
        System.out.println("전원 : " + onOffstr);
        System.out.println("볼륨 : " + channel);
        System.out.println("채널 : " + volume);

    }
}
