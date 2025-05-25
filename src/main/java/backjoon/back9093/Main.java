package backjoon.back9093;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());

            for(int i = 0; i < T; i++) {
                StringBuilder sb = new StringBuilder();
                String s = br.readLine();
                String [] arrs = s.split(" ");
                for (String w : arrs) {
                    sb.append(new StringBuilder(w).reverse().toString()).append(" ");
                }
                System.out.println(sb.toString().trim());
            }

        } catch (Exception e) {
            System.out.println("dddd");
        }
    }
}