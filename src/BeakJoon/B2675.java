package BeakJoon;

import java.io.*;
import java.util.StringTokenizer;

public class B2675 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        for(int i=0; i<cnt; i++){
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            int loop = Integer.parseInt(st.nextToken());
            String word = st.nextToken();

            for(int j=0; j<word.length(); j++){
                for(int k=0; k<loop; k++){
                    bw.write(word.substring(j,j+1));
                }
            }
            bw.write("\n");
        }
        bw.close();
    }
}
