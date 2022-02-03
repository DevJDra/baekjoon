package BeakJoon;

import java.io.*;
import java.util.StringTokenizer;

public class B2869 {

    public static void main (String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input," ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int result = (C-B)/(A-B);

        if( (C-B)%(A-B) != 0){
            result++;
        }
        bw.write(String.valueOf(result));
        bw.close();

    }
}
