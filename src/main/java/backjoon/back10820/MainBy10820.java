package backjoon.back10820;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainBy10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        List<String> inputList = new ArrayList<>();

        // 입력을 한 줄씩 받음 (Ctrl+D로 종료)
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            inputList.add(line);
        }

        for (String str : inputList) {
            int lower = 0, upper = 0, digit = 0, space = 0;

            for (char c : str.toCharArray()) {
                if (Character.isLowerCase(c)) lower++;
                else if (Character.isUpperCase(c)) upper++;
                else if (Character.isDigit(c)) digit++;
                else if (Character.isWhitespace(c)) space++;
            }

            System.out.println(lower + " " + upper + " " + digit + " " + space);
        }


    }
}
