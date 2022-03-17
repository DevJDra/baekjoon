package BeakJoon;

import java.io.*;

public class B3053 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        double uclid = input*input * Math.PI;
        double taxi = input*input*2;

        bw.write(String.format("%.6f", uclid) +"\n");
        bw.write(String.format("%.6f", taxi));

        bw.flush();
        bw.close();
    }
}
