package backjoon.back10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     StringBuilder output = new StringBuilder();
     int count = Integer.parseInt(br.readLine()) ;
     Queue<Integer> queue = new LinkedList<Integer>();

         while (count --> 0){
             String[] command = br.readLine().split(" ");
             switch (command[0]){
                 case "push":
                     queue.offer(Integer.parseInt(command[1]));
                     break;
                 case "pop":
                     if(queue.isEmpty()){
                         output.append("-1").append("\n");
                     }else{
                         output.append(queue.poll()).append("\n");
                     }
                     break;
                 case "size":
                     output.append(queue.size()).append("\n");
                     break;
                 case "empty":
                     if(queue.isEmpty()){
                         output.append("1").append("\n");
                     }else{
                         output.append("0").append("\n");
                     }
                     break;
                 case "front":
                     if(queue.isEmpty()){
                         output.append("-1").append("\n");
                     }else{
                         output.append(queue.peek()).append("\n");
                     }

                     break;
                 case "back":
                     if(queue.isEmpty()){
                         output.append("-1").append("\n");
                     }else{
                         int back = ((LinkedList<Integer>) queue).peekLast();
                         output.append(back).append("\n");
                     }
                     break;
             }
         }
        System.out.println(output);
    }

}
