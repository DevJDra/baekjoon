package BeakJoon;

import java.io.*;

public class B2439 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        if(1 <= N && N <= 100){
            for(int i = 0; i < N; i++) {
                for (int x = 1; x <= N; x++) {
                    if(x >= N-i){
                        bw.write("*");
                    }else{
                        bw.write(" ");
                    }
                }
                bw.write("\n");
            }
        }
        bw.flush();
    }
}
