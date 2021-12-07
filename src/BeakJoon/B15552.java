package BeakJoon;

import java.io.*;
import java.util.StringTokenizer;

public class B15552 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCnt = Integer.parseInt(br.readLine());
        int result;

        for(int i=0; i<testCnt; i++){
            String AB = br.readLine();
            StringTokenizer st = new StringTokenizer(AB, " ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            result = A+B;

            bw.write(String.valueOf(result));
            bw.write("\n");
        }
        bw.flush();
    }
}
