package BeakJoon;

import java.io.*;

public class B4948 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            int n = Integer.parseInt(br.readLine());
            int m = 2 * n;
            int count = 0;

            if(n == 0) break;

            int[] prime = new int[2*n + 1];

            prime[0] = 0;

            for (int i = 1; i <= m; i++) {
                prime[i] = i;
            }

            for (int i = 2; i * i <= m; i++) {
                if (prime[i] == 0) continue;
                for (int j = i * i; j <= m; j += i) {
                    prime[j] = 0;
                }
            }

            for (int i = n+1; i <= m; i++) {
                if (prime[i] != 0) {
                    count++;
                }
            }
            bw.write(String.valueOf(count) + "\n");
        }
        bw.close();
    }
}
