package backjoon.back10824;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        String[] numbers = input.split(" ");

        String A = numbers[0];
        String B = numbers[1];
        String C = numbers[2];
        String D = numbers[3];


        int abSum = Integer.parseInt(A+B);
        int cdSum = Integer.parseInt(C+D);

        System.out.println(abSum + cdSum);

    }

}
