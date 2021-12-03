package BeakJoon;

import java.io.*;

public class B2739 {

    public static void main(String args[]) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(bf.readLine());

        for(int i=1; i<=9 ; i++){
            bw.write(num + " * " + i +" = " + num*i);
            bw.write("\n");
        }
        bw.flush();
    }
}
