package BeakJoon;

import java.io.*;

public class B2562 {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[9];
        int max = arr[0];
        int maxIndex = 0;

        for(int i=0; i<arr.length; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
        }

        for(int k=0; k<arr.length; k++) {
            if(arr[k] > max){
                max = arr[k];
                maxIndex = k;
            }
        }

        bw.write(String.valueOf(max));
        bw.write("\n");
        bw.write(String.valueOf(maxIndex+1));

        bw.close();
    }
}
