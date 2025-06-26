package backjoon.back10808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MainBy10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //단어를 주어진다.
        char[] wordChars = br.readLine().toCharArray();
        // 주어진단어랑 key가 맞으면 value를 바꿔
        Map<Character, Integer> keyValueMap = new HashMap<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            keyValueMap.put(Character.valueOf(ch), 0);
        }


//        keyValueMap.forEach((k, v) -> {
//
//           for(char ch : wordChars) {
//               if(ch == k){
//                   keyValueMap.put(k, 1);
//
//               }
//           }
//        });

        for (char ch : wordChars) {
            keyValueMap.put(ch, keyValueMap.get(ch) + 1);
        }

        // a부터 z까지 순서대로 출력 (공백 포함)
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(keyValueMap.get(ch)).append(" ");
        }

        System.out.println(sb);
    }
}
