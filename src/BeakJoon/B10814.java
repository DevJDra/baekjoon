package BeakJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B10814 {
    public static void main (String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][2];

        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        Arrays.sort(arr, (o1, o2) -> {
            if(o1[0] != o2[0]){
                return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
            } else {
                return -1;
            }
        });

        for(int i=0; i<arr.length; i++){
            bw.write(arr[i][0] + " " + arr[i][1] + "\n");
        }
        bw.close();
    }
}
