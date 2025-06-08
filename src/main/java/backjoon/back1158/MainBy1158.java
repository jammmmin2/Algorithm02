package backjoon.back1158;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MainBy1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int peopole = Integer.parseInt(br.readLine()); //  사람이 7명입니다.
        int kill    = Integer.parseInt(br.readLine()); // 3텀으로 poll 할겁니다.

        StringBuilder sb = new StringBuilder();

        int[] peopoles = new int[peopole];
        for(int i = 0; i < peopoles.length; i++) {
            peopoles[i] = i;
        }


        for (int i = 1; peopoles.length > 0 ; i++){
            if(i*kill <  peopole){
                // 7명, 1*3 , 2*3
                int die = peopoles[i*kill];
                System.out.println(die);
            }else{
                // 3*3
            }

        }
            System.out.println();

    }
}
