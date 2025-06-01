package backjoon.back9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainBy9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int line = Integer.parseInt(br.readLine());

        while(line-->0){

           String f = br.readLine();

            List<String> arr = new ArrayList<>(Arrays.asList(f.split("")));
            boolean isValid = true;

           for(int i=0 ; i<arr.size()-1;i++){
               String a = arr.get(i);
               if("(".equals(a)){
                   for(int j=i+1 ;j<arr.size()-1;j++){
                       if(")".equals(arr.get(j))){
                           sb.append(a).append(arr.get(j));
                           arr.remove(j);
                           break;
                       }
                   }
               }else{
                   sb.append("끝");
               }
           }
            System.out.println("sb에 담긴 글 : "+ sb.toString());
        }
    }
}
