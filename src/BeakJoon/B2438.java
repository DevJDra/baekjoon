package BeakJoon;

import java.io.*;

public class B2438 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        if(1 <= N && N<=100) {
            for(int i = 1 ; i <= N; i++) {
                for(int x = 0; x < i; x++){
                   bw.write("*");
                }
                bw.write("\n");
            }
            bw.flush();
        }
    }
}
