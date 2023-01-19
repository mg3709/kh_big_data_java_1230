package 인터페이스리모컨;

public class Audio implements RemoteControl{
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("Audio 를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio 를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME){//인스턴스 필드로 만들어지지 않았지만 참조 가능
            this.volume = RemoteControl.MAX_VOLUME;
        }else if(volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨 : " + this.volume);
    }
    public void getInfo(){
        System.out.println("오디오 입니다");
        System.out.println("현재 볼륨은 " + volume + "입니다");
    }
    @Override
    public void setMute(boolean mute){//default 의 경우만 예외적으로 만들 수 있다
        if(mute)System.out.println("무음 처리 합니다");
        else System.out.println("무음 해제 합니다");
    }
}
