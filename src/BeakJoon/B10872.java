package BeakJoon;

import java.io.*;

public class B10872 {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int result = 1;
        if(input != 0){
            for (int i = 1; i <= input; i++) {
                result *= i;
            }
        }
        bw.write(String.valueOf(result));
        bw.close();
    }
}
