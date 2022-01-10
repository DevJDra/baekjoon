package BeakJoon;

import java.io.*;
import java.util.Arrays;

public class B11720 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String num = br.readLine();
        int[] arr = new int[num.length()];

        for(int i=0; i<num.length(); i++){

            arr[i] = Integer.parseInt(num.substring(i, i+1));
        }

        int result = Arrays.stream(arr).sum();

        bw.write(String.valueOf(result));
        bw.close();
    }
}
