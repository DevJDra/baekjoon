package BeakJoon;

import java.io.*;

public class B2741 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        if(N <= 100000){
            for(int i=1; i<= N; i++) {
                bw.write(String.valueOf(i) + "\n");
            }
        }
        bw.flush();
    }
}
