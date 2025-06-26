package backjoon.back10824;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainBy10824_2 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        String[] numbers = input.split(" ");


        long A = Long.parseLong(numbers[0]);
        long B = Long.parseLong(numbers[1]);
        long C = Long.parseLong(numbers[2]);
        long D = Long.parseLong(numbers[3]);

        long abSum = Long.parseLong( "" +A + B);
        long cdSum = Long.parseLong("" +C + D);

        System.out.println(abSum + cdSum);

    }
}
