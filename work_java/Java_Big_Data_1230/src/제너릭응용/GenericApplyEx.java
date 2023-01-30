package 제너릭응용;

public class GenericApplyEx {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());//Powder타입의 객체를 생성해서 매개변수로 전달
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powder);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plastic);

        GenericPrinter<Water> waterll = new GenericPrinter<>();
        waterll.setMaterial(new Water());
        Water water = waterll.getMaterial();
        System.out.println(water);
    }
}
