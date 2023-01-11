package TV만들기;

public class TvMain {
    public static void main(String[] args) {
        TV samsungTv = new TV();//기본 생성자
        TV lgtv = new TV(true,57,13);//매개변수가 있는 생성자 호출

        samsungTv.getTV();
        lgtv.getTV();

        samsungTv.setON(true);
        samsungTv.setChannel(130);
        samsungTv.setVolume(35);
        samsungTv.getTV();
    }
}
