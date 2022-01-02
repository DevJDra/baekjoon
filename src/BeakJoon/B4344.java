package BeakJoon;

import java.io.*;
import java.util.StringTokenizer;

public class B4344 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            String score = br.readLine();
            String score2 = score;
            StringTokenizer st = new StringTokenizer(score," ");
            StringTokenizer st2 = new StringTokenizer(score2," ");

            int sum = 0;
            int count = 0;
            int j=0;
            while(st.hasMoreTokens()){
                if(j==0){
                    count = Integer.parseInt(st.nextToken());
                }else{
                    sum += Integer.parseInt(st.nextToken());
                }
                j++;
            }
            j=0;
            double avg = sum/count;
            int sco = 0;
            int overAvgCnt = 0;
            int x = 0;
            while(st2.hasMoreTokens()){
                sco = Integer.parseInt(st2.nextToken());

                if(x != 0 && sco>avg){
                    overAvgCnt++;
                }
                x++;
            }
            x=0;
            double overAvg = (double)overAvgCnt/count * 100;

            String result = String.format("%.3f", overAvg);
            bw.write(result+"%\n");
        }
        bw.close();
    }
}
