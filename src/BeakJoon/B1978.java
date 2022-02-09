package BeakJoon;

import java.io.*;
import java.util.StringTokenizer;

public class B1978 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int primeNumber = 0;
        int result = 0;

        for(int i=0; i<n; i++){
            boolean chkNumber = true;
            primeNumber = Integer.parseInt(st.nextToken());

            if(primeNumber == 1){
                chkNumber = false;
            }else {
                for (int x = 2; x < primeNumber; x++) {
                    if (primeNumber % x == 0) {
                        chkNumber = false;
                        break;
                    }
                }
            }
            if (chkNumber == true) {
                result++;
            }
        }

        bw.write(String.valueOf(result));
        bw.close();
    }
}
