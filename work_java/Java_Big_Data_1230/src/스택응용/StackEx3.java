package 스택응용;

import java.util.Scanner;
import java.util.Stack;

//스택을 이용해서 괄호의 열림과 닫힘 제크
public class StackEx3 {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("수식 입력 : ");
        String exp = scanner.next();

        for(int i = 0; i < exp.length(); i++){

            char ch = exp.charAt(i);

            if(ch == '('){//열림 괄호일 때 push

                st.push(ch);//출력값 푸쉬
                System.out.println();

            } else if (ch == ')') {//닫히 괄호일 때 push
                if(!st.isEmpty()){
                    st.pop();//스택이 비어있지 않으며 pop
                }else{
                    System.out.println("괄호가 일치 하지 않습니다");
                    return;
                }
            }
        }
        if(st.isEmpty()) {
            System.out.println("괄호가 일치 하지않습니다");
        }else{
            System.out.println("괄호가 일치 합니다");
        }

    }
}
