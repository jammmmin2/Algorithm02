package backjoon.back17413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MainBy17413 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();
        Stack<Character> stack = new Stack<>();
        boolean inTag = false;
        for(char ch :  S.toCharArray()){

            if(ch == '<'){
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                inTag = true;
                sb.append(ch);
            }else if(ch == '>'){
                inTag = false;
                sb.append(ch);
            }else if (inTag) {
                sb.append(ch);
            }else if(ch == ' '){
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(ch);
            }else{
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb.toString());
    }
}
