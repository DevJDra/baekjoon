package BeakJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class B1546 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        String point = br.readLine();
        StringTokenizer st = new StringTokenizer(point," ");

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int arrayMax = Arrays.stream(arr).max().getAsInt();
        double total = 0;

        for(int x=0; x<arr.length; x++){
            
            total += arr[x]/(double)arrayMax*100;
        }
        double result = (double)total/n;
        bw.write(String.valueOf(result));
        bw.close();
    }
}
