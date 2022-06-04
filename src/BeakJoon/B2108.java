package BeakJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B2108 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int a = Math.round((Arrays.stream(arr).sum()) / n);

        int cNum = Math.round(n/2);
        int b = arr[cNum];

        int[] count = new int[n];
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            int index = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    index++;
                }
            }
            count[i] = index;
        }
        int maxNum = Arrays.stream(count).max().getAsInt();

        for(int i=0; i<count.length; i++){
            if(count[i] == maxNum){
                list.add(arr[i]);
            }
        }
        Arrays.asList(list).stream().sorted();

        int c = list.get(1);

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int d = max - min;

        bw.write(String.valueOf(a)+"\n");
        bw.write(String.valueOf(b)+"\n");
        bw.write(String.valueOf(c)+"\n");
        bw.write(String.valueOf(d));

        bw.close();
    }
}
