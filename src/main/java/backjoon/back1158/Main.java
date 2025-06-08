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
        int kill    = Integer.parseInt(input[1]);

        StringBuilder sb = new StringBuilder();

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= peopole; i++) {
            queue.offer(i);
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
