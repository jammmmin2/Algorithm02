package backjoon.back1158;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class MainBy1158_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int peopole = Integer.parseInt(br.readLine()); //  사람이 7명입니다.
        int kill    = Integer.parseInt(br.readLine()); // 3텀으로 poll 할겁니다.

        StringBuilder sb = new StringBuilder();

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= peopole; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < kill - 1; i++) {
                queue.offer(queue.poll());
            }

            sb.append(queue.poll());

            if (!queue.isEmpty()) {
                sb.append(", ");
            }
        }
        System.out.println(sb);
    }
}
