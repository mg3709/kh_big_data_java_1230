package 제너릭응용;

public class Plastic extends Material{
    public void doPrinting(){
        System.out.println("Plastic 재로로 출력합니다");
    }
    @Override
    public String toString(){
        return "재로는 Plastic 입니다";
    }
}
