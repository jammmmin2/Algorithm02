package backjoon.back10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back10828 {

    static int[] stack = new int[10001];
    static int size;

    public void solve() throws IOException {
        // 문제 풀이 코드
        System.out.println("Back10828 solving...");
        solve2();
    }


    public void solve2() throws IOException {
        System.out.println(
                "문제 : 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. \n" +
                "둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. \n" +
                "주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. \n" +
                "문제에 나와있지 않은 명령이 주어지는 경우는 없다.\n");

        System.out.println("명령은 총 다섯 가지이다.\n" +
                "\n" +
                "push X: 정수 X를 스택에 넣는 연산이다.\n" +
                "pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.\n" +
                "size: 스택에 들어있는 정수의 개수를 출력한다.\n" +
                "empty: 스택이 비어있으면 1, 아니면 0을 출력한다.\n" +
                "top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.\n\n");

        solve3();
    }

    public void solve3() throws IOException {
        System.out.println("solve3 문제 풀이 - 알고리즘 기초1/2\n\n");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < count; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            System.out.println("command = " + command +"\n");

            switch (command) {
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
        System.out.println(sb);
    }

    public void push(int num) {
        stack[size] = num;
        size++;
    }

    public int pop() {
        if(size == 0) return -1;
        else {
            int P = stack[size - 1];
            size--;
            return P;
        }
    }

    public int size() {
        return size;
    }

    public int empty() {
        if(size == 0) return 1;
        else return 0;
    }

    public int top() {
        if(size == 0) return -1;
        else {
            int T = stack[size - 1];
            return T;
        }
    }

}
