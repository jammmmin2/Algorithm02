package backjoon.back1935;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] aArry = br.readLine().split("");

        double[] values = new double[26];
        for (int i = 0; i < N; i++) {
            values[i] = Double.parseDouble(br.readLine());
        }

        Stack<Double> stack = new Stack();

        for(String token  : aArry) {
            char ch = token.charAt(0);

            if(Character.isUpperCase(ch)){
                stack.push(values[ch - 'A']);
            }else{
                double b = stack.pop();
                double a = stack.pop();
                double result = 0;
                switch(ch){
                    case '+': result = a + b; break;
                    case '-': result = a - b; break;
                    case '*': result = a * b; break;
                    case '/': result = a / b; break;
                }
                stack.push(result);
            }
        }
        System.out.printf("%.2f\n", stack.pop());
    }
}
