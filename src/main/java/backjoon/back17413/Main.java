package backjoon.back17413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();
        Stack<Character> stack = new Stack<>();
        boolean inTag = false;
        for(char ch :  S.toCharArray()){

            if(ch == '<'){//< 이거이면 일단 < 출력하고. intag = true로 바꿔
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
// stack 에서 꺼내는곳.
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb.toString());
    }
}


//2025/06/15 - 단어 뒤집기2(실버3)
//https://www.acmicpc.net/problem/17413

// stack을 이용하니까 어렵게 생각 안들었음.
// 이 문제의 핵심은 [] 배열에 단어를 넣는게 아니라
// 플래값을 이용해서 특수문자를 판단

