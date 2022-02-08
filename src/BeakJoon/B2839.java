package BeakJoon;

import java.io.*;

public class B2839 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int loop = n/5;
        int cnt = 0;
        int result = 0;

        a:for(int i=loop; i>=0; i--){
            int chk = 0;
            while(chk <= n){
                chk = 5*i + 3*cnt;

                if(chk == n){
                    result = i+cnt;
                    break a;
                }
                cnt++;
            }
            result = -1;
        }

        bw.write(String.valueOf(result));
        bw.close();
    }
}
