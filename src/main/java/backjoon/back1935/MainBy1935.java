package backjoon.back1935;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MainBy1935 {
    public static void main(String[] args) throws IOException {
        //핵심! 데이터 연산자 데이터 연산자 형태로 해야함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //첫째 줄에 피연산자(피연산자는 A~Z의 영대문자)의 개수
        int N = Integer.parseInt(br.readLine());

        //둘째 줄에는 후위 표기식이 주어진다.
        String[] aArry = br.readLine().split("");

        // 피연산자 값 입력 (A~Z 최대 26개)
        double[] values = new double[26];
        for (int i = 0; i < N; i++) {
            values[i] = Double.parseDouble(br.readLine());
        }

        // 후위표기식 계산용 스택
        Stack<Double> stack = new Stack();

        for(String token  : aArry) {
            char ch = token.charAt(0);

            //만약 문자이면
          if(Character.isUpperCase(ch)){
            stack.push(values[ch - 'A']);
            // stack => 1,2,3,4,5
          }else{
              //피연산자이면
              // *
              // +
              // /

              double b = stack.pop(); //5
              double a = stack.pop(); //4
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
        //소수점 둘째 자리까지 출력
        System.out.printf("%.2f\n", stack.pop());
    }
}
/*
2025/06/16후위 표기식2(실버3)
https://www.acmicpc.net/problem/1935

중위 , 전위 , 후위 의 말을 알아야함
중위 - 1*2
전위 - *12
후위 - 12*

핵심은
1. 숫자 연산자 숫자 연산자가 되어야함
2. 1+(2*3)-(4/5) 라고 하면 연산식 순위에 맞게 계산을 해야함

a. 숫자를 stack에 일단 담고
b. 연산식이 나오면 stack에서 pop하여 계산한다
 */