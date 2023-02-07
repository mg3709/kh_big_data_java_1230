package 예외처리예제5번;

import java.io.FileWriter;
import java.io.IOException;

//finally : 프로그램 실행 도중 예외가 발생 할 가능성이 있는 코드에 try 구문을 걸게 되는데,
//이때 예외가 발생하면 catch 구문으로 들어갑니다. 그렇지 않으면 아래의 코드가 실행됩니다
//이 경우 예외여부의 상관없이 항상 실행되어야 할 구문이 있다면 finally 로 처리 할 수 있습니다
public class ExceptionEx5 {
    public static void main(String[] args) {
        FileWriter f1 = null;
        try {
            f1 = new FileWriter("test.txt");
        } catch (IOException e) {

        } finally {
            try {
                if (f1 != null) {
                    f1.close();
                }
                }catch(IOException e){
                    e.printStackTrace();
            }
        }
    }
}
