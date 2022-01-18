package BeakJoon;

import java.io.*;

public class B2292 {
    public static void main(String args[]) throws IOException {
        //1 , 6 , 12, 18, 24 ,36 ,42 , 48, ,54, 60, 66

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int count = 1;
        int num = 0;
        int startNum = 1;

        if(input > 0) {
            while (startNum < input) {
                num += 6 ;
                startNum += num;
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.close();
    }
}
