package 입출력스트림예제5번;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InOutStreamEx5 {
    public static void main(String[] args) throws IOException {
        String originalFileName = "src/입출력스트림예제5번/bear.jpg";
        String targetFileName = "d:/clone_bear.jpg";

        FileInputStream fis = new FileInputStream(originalFileName);
        FileOutputStream fos = new FileOutputStream(targetFileName);

        int readByte;
        int cnt = 0;

        byte[] buffer = new byte[100];
        while((readByte = fis.read(buffer)) != -1){
            fos.write(buffer,0,readByte);

            cnt++;
        }

        fos.flush();
        fos.close();
        fis.close();
        System.out.println("복사 완료, 버퍼 읽기 횟수 : " + cnt);
    }
}
