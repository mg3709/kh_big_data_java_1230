package 로또번호생성리스트이용;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
//리스트 타입 => HashSet 이용해 중복 제거로 변경하기
public class LottoArrayList {
    public static void main(String[] args) {

        HashSet<Integer> list = new HashSet<>(Arrays.asList());//갯수 지정 필요 없음
        int tmp;//로또 번호를 임시로 저장하는 변수

        while(true){

            tmp = (int)((Math.random() * 45) + 1);
            if(!list.contains(tmp)) list.add(tmp);
            if(list.size() == 6)break;

        }

        for (Integer e : list)System.out.print(e + " ");
    }
}
