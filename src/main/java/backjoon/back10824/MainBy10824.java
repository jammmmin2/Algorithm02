package backjoon.back10824;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainBy10824 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();
        int N = 4;
        while(N --> 0){
            list.add(Integer.parseInt(br.readLine()));
        }

        int A = list.get(0);
        int B = list.get(1);
        int C = list.get(2);
        int D = list.get(3);


        int abSum = Integer.parseInt(String.valueOf(A) + String.valueOf(B));
        int cdSum = Integer.parseInt(String.valueOf(C) + String.valueOf(D));

        System.out.println(abSum + cdSum);


    }
}
