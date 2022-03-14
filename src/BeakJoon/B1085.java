package BeakJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1085 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input," ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int[] arr = new int[] {x-0,y-0,w-x,h-y};

        int min = Arrays.stream(arr).min().getAsInt();

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
    }
}
