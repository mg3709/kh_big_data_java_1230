package 다운캐스팅;
//다운 캐스팅 : 상위 클래스형으로 변환 되었던 하위클래스용 다시 원래 자료형으로 변환 것
//instanceOf : 형변환 가능여부를 확인하는 용도(참조 변수가 참조하고 있는 객체의 실제 타입을 알아보기 위해사용)

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DownCasting {
    ArrayList<Animal> aniList = new ArrayList<Animal>();
    public static void main(String[] args) {
        DownCasting dc = new DownCasting();
        dc.addAnimal();
        dc.testCasting();
    }
    public void addAnimal(){
        aniList.add(new Human());//ArrayList 에 추가되면서 타입이 Animal 형으로 변환
        aniList.add(new Tiger());
        aniList.add(new Eagle());
        for(Animal e : aniList)e.Move();
    }
    public void testCasting(){
        for(int i = 0; i < aniList.size(); i++){
            Animal ani = aniList.get(i);//List의 해당 인덱스 값을 가져옴
            if(ani instanceof Human){//human 타입으로 형변환의 가능여부를 물어봄
                Human h = (Human) ani;
                h.readBook();
            }else if(ani instanceof Tiger){
                Tiger t = (Tiger) ani;
                t.hunting();
            }else if(ani instanceof Eagle){
                Eagle e = (Eagle) ani;
                e.flying();
            }else{
                System.out.println("지원 되지 않는 형입니다");
            }
        }
    }
}
