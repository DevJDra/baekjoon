package BeakJoon;

import java.io.*;

public class B8393 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        int result = 0;

        if(n >= 1 && n <= 10000) {
            for (int i = 0; i <= n; i++) {
                result += i;

            }
        }
        bw.write(String.valueOf(result));
        bw.close();
    }
}
