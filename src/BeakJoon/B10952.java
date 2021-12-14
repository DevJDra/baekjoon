package BeakJoon;

import java.io.*;
import java.util.StringTokenizer;

public class B10952 {

    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            while(true) {
                String value = br.readLine();
                StringTokenizer st = new StringTokenizer(value," ");

                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                if(A == 0 && B == 0) {
                    break;
                } else if(A > 0 && B > 0 && A<10 && B < 10) {

                    bw.write(String.valueOf(A + B));
                    bw.write("\n");
                };
            }
            bw.flush();
        }
    }
