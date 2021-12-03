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
            //readLine은 한 행을 전부 읽기때문에 공백단위로 입력한 문자열을 분리 해주어야 한다.
            StringTokenizer st = new StringTokenizer(AB, " ");
            //StringTokenizer 클래스 를 이용해 분리 해준다.
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int result = A+B;

            bw.write(String.valueOf(result));
            bw.write("\n");

        }
        bw.flush();
    }
}
