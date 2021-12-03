package BeakJoon;

import java.io.*;
import java.util.StringTokenizer;

public class B10950 {

    public static void main(String args[]) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(bf.readLine());

        for(int i=0; i< num; i++){

            String AB = bf.readLine();
            StringTokenizer st = new StringTokenizer(AB, " ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int result = A+B;

            bw.write(String.valueOf(result));
            bw.write("\n");

        }
        bw.flush();
    }
}
