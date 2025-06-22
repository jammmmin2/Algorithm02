package backjoon.back1918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MainBy1918 {
    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // String ->  br.readLine().split("");
       // char -> br.readLine().toCharArray();
       char[] cal = br.readLine().toCharArray();
       Stack<Character> stack = new Stack<>(); // 연산자를 담을 스택
       StringBuilder sb = new StringBuilder();//정답을 담을 문자열

       for(int i = 0; i< cal.length; i++) {
            //숫자일때
           if(cal[i] >= 'A' && cal[i] <= 'Z'){
               sb.append(cal[i] + "");
           }else{
               //연산자일때
               if(cal[i] == '(') {
                   stack.push(cal[i]);
               }else if(cal[i] == ')') {  //  '('이 나올때까지 문자열에 담아준다.
                   while(!stack.isEmpty() && stack.peek() != '(') {
                       sb.append(stack.pop()); //괄호가 아니면 연산자를 꺼내어 문자열에 담는다.
                   }
                   if(!stack.isEmpty()) stack.pop(); //'('연산자를 꺼내준다.
               }else{  // + - / * 연산자 일경우
                   while(!stack.isEmpty()
                           && precedence(stack.peek()) >= precedence(cal[i])) {
                       sb.append(stack.pop());
                   }
                   stack.push(cal[i]);
               }
           }
       }

        //스택에 있는 남은 연산자를 모두 꺼낸다.
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }

    public static int precedence(char op) {
        if(op == '*' || op == '/') return 2;
        else if(op == '+' || op == '-') return 1;
        //스택 안에는 '('도 들어올 수 있다. 하지만 '('는 꺼내져서는 안되기 때문에 제일 낮은 값을 반환하도록 한다
        else return 0;
    }
}
