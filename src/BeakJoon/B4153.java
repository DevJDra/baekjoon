package BeakJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B4153 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String input = br.readLine();
            int[] arr = new int[3];
            StringTokenizer st = new StringTokenizer(input, " ");

            for(int i=0; i<arr.length; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            int a = arr[0];
            int b = arr[1];
            int c = arr[2];

            if(a == 0 && b == 0 && c == 0){
                break;
            }
            int result = a*a + b*b;
            int result2 = c*c;

            if(result == result2){
                bw.write("right\n");
            }else{
                bw.write("wrong\n");
            }
        }

        bw.close();
    }
}
