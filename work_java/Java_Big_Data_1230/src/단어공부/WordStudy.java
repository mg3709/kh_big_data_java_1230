package 단어공부;

import java.util.Scanner;

//알파벳 대소문자로 이루어진 단어가 주어지면 가장 많이 동장한 알파벳을 찾는 문제
//입력은 대소문자를 입력하고, 결과는 대소문자 구분하지 않음, 결과는 대문자로 출력
//만약 가장 많이 동작하는 알파벳이 여러개인 경우는 ? 로 출력
//결과 예시 : AaAbcdd => A
//결과 예시 : ddcfgrG => ?
public class WordStudy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("영단어를 입력하시오 : ");
        String word = scanner.next();
        int max = 0;//제일 큰수 찾기
        char result = 0;//결과값으로 출력할 알파벳
        int[] arr = new int[26];//알파벳 개수 만큼의 배열 생성(가장 많이 등장하는 알파벳을 count 하기 위해)
        for(int i = 0; i < word.length(); i++){//입력 받은 단어의 길이만큼 순회
            if('A' >= word.charAt(i) && word.charAt(i) <= 'Z') {
                arr[word.charAt(i) - 'A']++;
            }else {
                arr[word.charAt(i) - 'a']++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max)result = '?';//배열 인덱스의 값과 max 값이 같으면 '?'
            else if (arr[i] > max) {
                max = arr[i];//인덱스에 해당하는 배열값이 더 크면 max 값을 변경
                result = (char)('A' + i);//배열의 인덱스에서 'A' 만큼 값을 증가 시켜서 실제 대문자 ASCII 값을 구함
            }
        }
        System.out.println(result);
    }
}
