package backjoon.back10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainBy10809_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] word = br.readLine().toCharArray();

        Map<Character,Integer> keyValueMap = new HashMap<>();
        for(char ch = 'a' ; ch <= 'z'; ch++){
            keyValueMap.put(ch, -1);
        }

        //keyValueMap 담긴 알파벳의 위치를 알기 위해서,,
        List<Character> keyList = new ArrayList<>(keyValueMap.keySet());

        for(char ch : word){
            //keyList에서 ch는 몇번째에 있지?
            int index = keyList.indexOf(ch);

            //keyValueMap에 b의 value 값을 index로 바꿔
            if(keyValueMap.containsKey(ch)){
                keyValueMap.put(ch, index);
            }
        }


        for (Map.Entry<Character, Integer> entry : keyValueMap.entrySet()) {
            sb.append(entry.getValue()).append(" ");
        }

        System.out.println(sb);
    }
}
