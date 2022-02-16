package BeakJoon;

import java.io.*;

public class B11653 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int i=2;
        while(n >= i){
            if(n%i == 0){
                bw.write(String.valueOf(i)+"\n");
                n /= i;
            }else{
                i++;
            }
        }
        bw.close();
    }
}
