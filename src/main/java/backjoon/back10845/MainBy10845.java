package backjoon.back10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MainBy10845 {
    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     StringBuilder output = new StringBuilder();
     int count = Integer.parseInt(br.readLine()) ; // 몇번 명령어 쓸건지
        int frontNumber ;
     Stack<Integer> stack = new Stack<>();


     while (count --> 0){
         String[] a = new String[2]; // 명령어를 push 이렇게 썼을때 0 은 명령어, 1은 숫자
         a = br.readLine().split(" ");

         String command = a[0];
         int number = Integer.parseInt(a[1]);

         switch (command){
             case "push":
                 stack.push(number);
                 output.append(number).append("\n");
                 break;
             case "pop":
                 stack.pop();
                 output.append(stack.pop()).append("\n");
                 break;
             case "size":
                 stack.size();
                 output.append( stack.size()).append("\n");
                 break;
             case "empty":
                 if(stack.isEmpty()){
                     output.append("1").append("\n");
                 }else{
                     output.append("0").append("\n");
                 }
                 break;
             case "front":
                 if(stack.isEmpty()){
                     output.append("-1").append("\n");
                 }else{
                     stack.get(0);
                     output.append(stack.get(0)).append("\n");
                 }

                 break;
             case "back":
                 if(stack.isEmpty()){
                     output.append("-1").append("\n");
                 }else{
                     stack.peek();
                     output.append(stack.peek()).append("\n");
                 }
                 break;
         }

         System.out.println(output);
     }

    }

}
