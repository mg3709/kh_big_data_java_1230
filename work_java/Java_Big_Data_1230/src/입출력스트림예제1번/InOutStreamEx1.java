package 입출력스트림예제1번;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//입출력 스트림 : 컴퓨터 내부와 외부장치 간에 데이터를 주고 받는 것을 의미하며,
//입출력 데이터를 공통적인 방법으로 처리하기 위한 스트림을 제공합니다
//바이트 스트림 : 바이트 단위로 데이터를 전송하는 것, 성능이 우수하고 ,파일로 저장시 결과 확인 불가
//ByteStream 의 취상위 추상클래스는 OutputStream 입니다.
public class InOutStreamEx1 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("test.txt");
        byte[] arr = {10,20,30,40,50};
        os.write(arr,1,3);//문자 배열을 write 하기(배열 1 4개를 출력

        os.flush();//write() 이후에는 반드시 버퍼를 비우는 동작이 필요
        os.close();//자원 반납 및 스트림 닫기
    }
}
