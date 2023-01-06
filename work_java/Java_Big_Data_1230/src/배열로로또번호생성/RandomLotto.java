package 배열로로또번호생성;

//1~45 사이의 임의의 수 6개로 구성
//1. 배열로 로또 번호 생성해 출력하기
//2. 배열로 로또 번호 생성 (중복 제거)
//3. 다른 자료구조를 사용해 로또 번호 만들기 (ArratList, Set)

public class RandomLotto {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        int val, index = 0;
        boolean isExist = false;

        while(true) {

            val = (int)((Math.random() * 45) + 1);
            for (int i = 0; i < 6; i++) {

                if (lotto[i] == val) isExist = true;

            }

            if(!isExist) lotto[index++] = val;
            if(index == 6) break;
            isExist = false;

        }
        for(int i = 0; i < 6; i++) {

            System.out.print(lotto[i] + " ");

        }

        System.out.println();

    }
}