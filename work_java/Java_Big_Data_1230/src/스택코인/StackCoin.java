package 스택코인;

import java.util.Stack;

public class StackCoin {
    public static void main(String[] args){
        Stack<Coin> st = new Stack<>();
        st.push(new Coin(100));//new Integer(100)
        st.push(new Coin(50));
        st.push(new Coin(500));
        st.push(new Coin(10));

        while(!st.isEmpty()){
            Coin coin = st.pop();
            System.out.println("꺼내온 동전 : "  + coin.getValue());
        }
    }
}
class Coin{
    private int value;
    public Coin(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}