package BeakJoon;

import java.io.*;
import java.util.StringTokenizer;

public class B1712 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input," ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int bp = C-B;
        int result = 0;
        if(B > C){
            result = -1;
        }else{
            if( bp != 0) {
                result = (A / bp) + 1;
            }else{
                result = -1;
            }
        }
        bw.write(String.valueOf(result));
        bw.close();
    }
}
