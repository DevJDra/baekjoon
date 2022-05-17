package BeakJoon;

import java.io.*;

public class B2231 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = 0;
        int num = 0;
        boolean chkResult = false;
        for(int i=1; i<=n ; i++){
            result = i;
            num = i;
            while(num > 0){
                result += num%10;
                num = num/10;
            }
            if(result == n){
                chkResult = true;
                bw.write(String.valueOf(i));
                break;
            }
        }
        if(chkResult == false){
            bw.write("0");
        }
        bw.close();
    }
}
