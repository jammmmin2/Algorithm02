package backjoon.back1918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] cal = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i< cal.length; i++) {

            if(cal[i] >= 'A' && cal[i] <= 'Z'){
                sb.append(cal[i] + "");
            }else{
                if(cal[i] == '(') {
                    stack.push(cal[i]);
                }else if(cal[i] == ')') {
                    while(!stack.isEmpty() && stack.peek() != '(') {
                        sb.append(stack.pop());
                    }
                    if(!stack.isEmpty()) stack.pop();
                }else{
                    while(!stack.isEmpty()
                            && precedence(stack.peek()) >= precedence(cal[i])) {
                        sb.append(stack.pop());
                    }
                    stack.push(cal[i]);
                }
            }
        }
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }

    public static int precedence(char op) {
        if(op == '*' || op == '/') return 2;
        else if(op == '+' || op == '-') return 1;
        else return 0;
    }


}
