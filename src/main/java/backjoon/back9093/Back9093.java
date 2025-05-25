package backjoon.back9093;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Back9093 {

    public void sold(){
        System.out.println("### Back9093 문제 시작 #### ");

        sold2();
    }

    public void sold2(){
        System.out.println("첫째 줄에 테스트 케이스의 개수 T가 주어진다. \n  각 테스트 케이스는 한 줄로 이루어져 있으며, 문장이 하나 주어진다. \n  단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. \n 단어와 단어 사이에는 공백이 하나 있다. \n\n");
        sold3();
    }

    public void sold3(){
        try{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            String s = br.readLine();
            String [] arrs = s.split(" ");
//
            System.out.println("arrs.length : "  + arrs.length); //We want to win the first prize

            // arrs 의 단어 뭉치,,
            for (int i = 0; i < arrs.length; i++){
                arrs[i] = new StringBuilder(arrs[i]).reverse().toString();
            }

            System.out.println("정답: " + String.join(" ", arrs));

        }catch (Exception e){
            System.out.println("try-catch");
        }

    }

}
