package BeakJoon;

import java.io.*;
import java.util.StringTokenizer;

public class B2908 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        String A = st.nextToken();
        String B = st.nextToken();

        String num1 = "";
        String num2 = "";

        for(int i=A.length(); i>0; i--){
            num1 += A.substring(i-1, i);
        }

        for(int j=A.length(); j>0; j--){
            num2 += B.substring(j-1, j);
        }

        if(Integer.parseInt(num1) > Integer.parseInt(num2)){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }
}
