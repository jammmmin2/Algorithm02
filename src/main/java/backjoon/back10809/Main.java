package backjoon.back10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] word = br.readLine().toCharArray();

        Map<Character,Integer> keyValueMap = new HashMap<>();
        for(char ch = 'a' ; ch <= 'z'; ch++){
            keyValueMap.put(ch, -1);
        }

        // 문자열 순회하며, 첫 등장 위치만 저장
        for (int i = 0; i < word.length; i++) {
            char ch = word[i];
            if (keyValueMap.get(ch) == -1) {
                keyValueMap.put(ch, i);
            }
        }

        // a~z 순서대로 출력
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(keyValueMap.get(ch)).append(" ");
        }

        System.out.println(sb);
    }
}
