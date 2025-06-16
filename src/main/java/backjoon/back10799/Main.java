package backjoon.back10799;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        Stack<Character> stack = new Stack<>();
        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else { // ch == ')'
                stack.pop();

                if (input.charAt(i - 1) == '(') {
                    result += stack.size();
                } else {
                    result += 1;
                }
            }
        }

        System.out.println(result);
    }
}
//2025/06/15 - 쇠막대기(실버2)
//https://www.acmicpc.net/problem/10799

// 문제가 너무 어려워서 혼자 못품..


