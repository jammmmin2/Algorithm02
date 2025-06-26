package backjoon.back10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainBy10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] word = br.readLine().toCharArray();

        Map<Character,Integer> keyValueMap = new HashMap<>();
        for(char ch = 'a' ; ch <= 'z'; ch++){
            keyValueMap.put(ch, -1);
        }

//        //keyValueMap 담긴 알파벳의 위치를 알기 위해서,,
//        List<Character> keyList = new ArrayList<>(keyValueMap.keySet());

        // 문자열 순회하며, 첫 등장 위치만 저장
        for (int i = 0; i < word.length; i++) {
            char ch = word[i];
            if (keyValueMap.get(ch) == -1) {
                keyValueMap.put(ch, i);
            }
        }

//
//        for(char ch : word){
//            //keyList에서 ch는 몇번째에 있지?
//            int index = keyList.indexOf(ch);
//
//            //keyValueMap에 b의 value 값을 index로 바꿔
//            if(keyValueMap.containsKey(ch)){
//                keyValueMap.put(ch, index);
//            }
//        }


        // a~z 순서대로 출력
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(keyValueMap.get(ch)).append(" ");
        }

        System.out.println(sb);
    }
}
