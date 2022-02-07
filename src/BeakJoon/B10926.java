package BeakJoon;

import java.io.*;

public class B10926 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        input = input + "??!";

        bw.write(input);
        bw.close();
    }
}
