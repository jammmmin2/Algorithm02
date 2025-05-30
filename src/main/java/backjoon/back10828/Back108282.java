package backjoon.back10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back108282 {
    static int[] stack = new int[10001];
    static int size;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();
            System.out.println("S = " + S);
            switch (S) {
                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    sb.append(pop()).append("\n");
                    break;
                case "size" :
                    sb.append(size()).append("\n");
                    break;
                case "empty" :
                    sb.append(empty()).append("\n");
                    break;
                case "top" :
                    sb.append(top()).append("\n");
                    break;
            }
        }
        System.out.println("답 : "+sb+"\n");
    }

    public static void push(int num) {
        stack[size] = num;
        size++;
    }

    public static int pop() {
        if(size == 0) return -1;
        else {
            int P = stack[size - 1];
            size--;
            return P;
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if(size == 0) return 1;
        else return 0;
    }

    public static int top() {
        if(size == 0) return -1;
        else {
            int T = stack[size - 1];
            return T;
        }
    }

}
