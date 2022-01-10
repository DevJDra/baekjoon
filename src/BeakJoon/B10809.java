package BeakJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class B10809 {
    public static void main (String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();

        char[] arr = new char[26];
        int[] result = new int[26];

        int j=0;
        for(char i='a'; i<='z'; i++){
            arr[j] = i;
            j++;
        }

        for(int x=0; x<word.length(); x++){
            String alphabet = word.substring(x,x+1);
            for(int y=0; y<arr.length; y++){
                String arr2 = String.valueOf(arr[y]);

                if(x == 0){
                    result[y] = -1;
                }
                if(result[y] == -1) {
                    if (alphabet.equals(arr2)) {
                        result[y] = x;
                    }
                }
            }
        }

        for(int z=0; z<result.length; z++){
            bw.write(String.valueOf(result[z])+" ");
        }
        bw.close();
    }
}
