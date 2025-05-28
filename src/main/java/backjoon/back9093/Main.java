package backjoon.back9093;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // 변경할 문장 수
            int T = Integer.parseInt(br.readLine());

            for(int i = 0; i < T; i++) {
                StringBuilder sb = new StringBuilder();
                String s = br.readLine();
                String[] arrs = s.split("//s+"); //공백 두칸이면 하나는 문자열로 취급! //s+
                for (String w : arrs) {
                    // reverse() : 반전시키는거
                    // String[] words = {"hello", "java", "world"};
                    // ㄴ > {"olleh", "avaj", "dlrow"}
                    sb.append(new StringBuilder(w).reverse()).append(" ");
                }
                //trim()은 문자열의 앞뒤에 있는 공백(스페이스, 탭, 줄바꿈 등)을 제거
                System.out.println(sb.toString().trim());
            }
// 구버전
//
//            StringTokenizer st = new StringTokenizer(in.readLine());
//
//            int n = Integer.parseInt(st.nextToken()); // 카드 갯수
//            int m = Integer.parseInt(st.nextToken()); // 목표 합
//
//            st = new StringTokenizer(in.readLine());
//            int[] deck = new int[n];
//            for (int i = 0; i < deck.length; i++) {
//                deck[i] = Integer.parseInt(st.nextToken()); //st.nextToken() : 공백 기준으로 잘라줌
//            }

        } catch (Exception e) {
            System.out.println("dddd");
        }
    }
}