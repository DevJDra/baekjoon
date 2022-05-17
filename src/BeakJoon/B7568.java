package BeakJoon;

import java.io.*;
import java.util.StringTokenizer;

public class B7568 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int loop = Integer.parseInt(br.readLine());

        int arrX[] = new int[loop];
        int arrY[] = new int[loop];
        int rank[] = new int[loop];

        for(int i=0; i<loop; i++){
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arrX[i] = x;
            arrY[i] = y;
        }
        for(int i=0; i<loop; i++){
            int cnt = 1;
            for(int j=0; j<loop; j++){
                if(arrX[j] > arrX[i]) {
                    if(arrY[j] > arrY[i]){
                        cnt++;
                    }
                }
                rank[i] = cnt;
            }
        }
        for(int i=0; i<loop; i++){
            bw.write(String.valueOf(rank[i]+" "));
        }
        bw.close();
    }
}
