package backjoon.back9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());

        while(line-->0){
           String f = br.readLine();
           Stack<String> stack = new Stack<String>();
            List<String> arr = new ArrayList<>(Arrays.asList(f.split("")));
            boolean flag = true;

           for(String s : arr){
               if(s.equals("(")){
                   stack.push(s);
               }else{
                   if(stack.isEmpty()){
                       flag = false;
                   }else{
                       stack.pop();
                   }
               }
           }
           if(!stack.isEmpty()){
               flag = false;
           }
            System.out.println(flag ? "YES" : "NO");
        }
    }
}
