package backjoon.back1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MainBy1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String start = br.readLine(); // abc

        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        for (char c : start.toCharArray()) {
            left.push(c);
        }

        int N = Integer.parseInt(br.readLine());
        while (N --> 0) {
            String temp = br.readLine();

            switch (temp.charAt(0)) {
                case 'L':
                    if(!left.isEmpty()){
                        right.push(left.pop());
                    }
                    break;
                case 'D':
                    if(!right.isEmpty()){
                        left.push(right.pop());
                    }
                    break;
                case 'B':
                    if (!left.isEmpty()) {
                        left.pop();
                    }
                    break;
                case 'P':
                    char x = temp.charAt(2);
                    left.push(x);
                    break;

            }
        }

        StringBuilder sb = new StringBuilder();

        for(char s  : left){
            sb.append(s);
        }

        while(!right.isEmpty()){
            sb.append(right.pop());
        }

        System.out.println(sb);

    }

}
