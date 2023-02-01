package 클래스정렬예제1;

public class CarSort implements Comparable<CarSort> {
    String modelName;
    int modelYear;
    String color;
    public CarSort(String name, int year, String color){
        modelName = name;
        modelYear = year;
        this.color = color;
    }
    @Override
    public int compareTo(CarSort o) {
        if(this.modelYear == o.modelYear){
            return this.modelName.compareTo(o.modelName);//앞의 문자열 사전순으로 뒤에 있으면 양수값 반환
        }
        return this.modelYear - o.modelYear;//앞의 객체가 뒤의 객체보다 크면 정렬 (오름차순 정렬)
    }
}
