package backjoon.back1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int start = 0;
        int idx =0;
        boolean possible = true;
        while(n-->0){
            int value = Integer.parseInt(br.readLine());
            if(value > start ){
                for(int j = start+1 ; j <= value ; j++){
                    //값이 크면 배열에 넣어줌
                    arr[idx] = j;
                    idx++;
                    output.append('+').append('\n');
                }
                start = value;
            }
            if(arr[idx-1] == value){
                idx--;
                output.append('-').append('\n');
            }else{
                possible = false;
                break;
            }
        }
        if (possible) {
            System.out.println(output);
        } else {
            System.out.println("NO");
        }
     }
}
