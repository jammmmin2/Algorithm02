package backjoon.back11656;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainBy11656 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int wordLength = word.length();

        int i = 0;
        //문자를 일단 하나씩 짤라서 배열에 넣고
        List<String> st = new ArrayList<>();
        while (wordLength-- > 0) {
            String suffix = word.substring(i, word.length());
            st.add(suffix);
            i++;
        }

        // 그 배열을 사전순으로 정렬
        Collections.sort(st);

        for (String s : st) {
            System.out.println(s);
        }
    }
}
