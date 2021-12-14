package BeakJoon;

import java.io.*;
import java.util.StringTokenizer;

public class B10951 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st;
        String value;

        while((value=br.readLine()) != null){

            st = new StringTokenizer(value, " ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if(0<A && 0<B && A<10 && B<10){
                bw.write(String.valueOf(A+B));
                bw.write("\n");
            }
        }
        bw.close();
    }
}
