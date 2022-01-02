package BeakJoon;

import java.io.*;
import java.util.StringTokenizer;

public class B8958 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int x=0; x<n; x++) {
            String quiz = br.readLine();

            int i = 0;
            int sum = 0;

            for(int j=0; j<quiz.length(); j++){
                if(quiz.charAt(j) == 'O'){
                    i++;
                    sum += i;
                }else{
                    i = 0;
                }
            }
            bw.write(String.valueOf(sum)+"\n");
        }
        bw.close();
    }
}
