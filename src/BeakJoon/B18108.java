package BeakJoon;

import java.io.*;

public class B18108 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(br.readLine());

        int result = year - 543;

        bw.write(String.valueOf(result));
        bw.close();
    }
}
