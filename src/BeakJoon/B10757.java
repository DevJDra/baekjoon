package BeakJoon;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class B10757 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input, " ");

        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());

        BigInteger result = a.add(b);

        bw.write(String.valueOf(result));

        bw.close();
    }
}
