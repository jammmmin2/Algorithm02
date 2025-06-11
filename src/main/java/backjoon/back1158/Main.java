package backjoon.back1158;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int peopole = Integer.parseInt(input[0]);
        int kill    = Integer.parseInt(input[1]); // a몇번째 ㅈㄱ일거야

        StringBuilder sb = new StringBuilder();

        Queue<Integer> queue = new LinkedList<>();
        //Queue 가 LinkedList로 되어있음
        //Queue라는 알고리즘을 뭘로 구현하냐! 그것이 LinkedList로 방식이다
        //즉, 이 큐는 정수만 다룰 수 있어


        for(int i = 1; i <= peopole; i++) {
            queue.offer(i); // 1,2,3,4,5,6,7
        }
        sb.append("<");
        while (!queue.isEmpty()) {
            for (int i = 0; i < kill - 1; i++) {
                queue.offer(queue.poll());
            }

            sb.append(queue.poll());

            if (!queue.isEmpty()) {
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}
