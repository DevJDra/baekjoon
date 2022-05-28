package BeakJoon;

import java.io.*;
import java.util.Arrays;

public class B10989 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            int input = Integer.parseInt(br.readLine());
            arr[i] = input;
        }

        Arrays.sort(arr);

        for(int arr2 : arr){
            bw.write(String.valueOf(arr2) + "\n");
        }
        bw.close();
    }
}
