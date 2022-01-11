package BeakJoon;

import java.io.*;
import java.util.Arrays;

public class B1157 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        input = input.toUpperCase();
        String[] arr = new String[26];
        int[] result = new int[26];
        int cnt = 0;

        for(char i='a'; i<='z'; i++){
            arr[cnt] = String.valueOf(i);
            cnt++;
        }

        for(int x=0; x<input.length(); x++) {
            int idx = input.charAt(x) - 'A';
            result[idx]++;
        }

        int max = Arrays.stream(result).max().getAsInt();
        String letter2 = "";

        for(int z=0,a=0; z<result.length; z++){
            if(result[z] == max){
                if(a==0) {
                    letter2 = arr[z].toUpperCase();
                }else{
                    letter2 = "?";
                }
                a++;
            }
        }

        bw.write(letter2);
        bw.flush();
        bw.close();
    }
}
