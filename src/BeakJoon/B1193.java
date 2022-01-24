package BeakJoon;

import java.io.*;

public class B1193 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int i = 1;
        int cnt = 1;
        int num = 1;
        while(cnt<input){
            i++;
            cnt += i;
        }

        int loop = cnt - input;
        if(i % 2 == 0){
            bw.write((i-loop)+"/"+(1+loop));
        }else{
            bw.write((1+loop)+"/"+(i-loop));
        }
        bw.flush();
    }
}
