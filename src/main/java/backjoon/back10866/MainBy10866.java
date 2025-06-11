package backjoon.back10866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class MainBy10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dec = new ArrayDeque<>();
        //반복할 수를 정한다.
        int N = Integer.parseInt(br.readLine());

        while(N -->0){
            //행위를 배열에 저장한다. [0]=push_back , [1]= 2
            String[] input = br.readLine().split(" ");
            String command;
            int x=0;
            if(input.length == 2){
                //행위
                command = input[0];
                //숫자
                x = Integer.parseInt(input[1]);
            }else{
                //행위
                command = input[0];
            }


            switch(command){
                case "push_back": //push_back X: 정수 X를 덱의 뒤에 넣는다.
                    dec.addLast(x);
                    break;
                case "push_front": //push_front X: 정수 X를 덱의 앞에 넣는다.
                    dec.addFirst(x);
                    break;
                case "front": //덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                    if(!dec.isEmpty()){
                        dec.peekFirst();
                        sb.append("front : ").append(dec.peekFirst()).append("\n");
                    }else{
                        sb.append("front : ").append("-1").append("\n");
                    }
                    break;
                case "back": //덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                    if(!dec.isEmpty()){
                        dec.peekLast();
                        sb.append("back : ").append(dec.peekLast()).append("\n");
                    }else{
                        sb.append("back : ").append("-1").append("\n");
                    }
                    break;
                case "size":// 덱에 들어있는 정수의 개수를 출력한다.
                    sb.append("size : ").append(dec.size()).append("\n");
                    break;
                case "empty"://덱이 비어있으면 1을, 아니면 0을 출력한다.
                    if (dec.isEmpty()) {
                        sb.append("empty : ").append("1").append("\n");
                    }else{
                        sb.append("empty : ").append("0").append("\n");
                    }
                    break;
                case "pop_front": //덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.

                    if(!dec.isEmpty()){
                        sb.append("pop_front : ").append(dec.remove()).append("\n");
                    }else{
                        sb.append("pop_front : ").append("-1").append("\n");
                    }
                    break;
                case "pop_back"://덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                    if(!dec.isEmpty()){
                        sb.append("pop_back : ").append(dec.removeLast()).append("\n");
                    }else{
                        sb.append("pop_back : ").append("-1").append("\n");
                    }

                    break;
            }

        }
        System.out.println(sb);
    }
}
