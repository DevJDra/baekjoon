package BeakJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B1152 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        ArrayList<String> arr = new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(input, " ");

        int cnt=0;
        while(st.hasMoreTokens()){
            st.nextToken();
            cnt++;
        }

        System.out.println(cnt);
    }
}
