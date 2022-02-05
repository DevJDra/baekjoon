package BeakJoon;

import java.io.*;
import java.util.StringTokenizer;

public class B10250 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());

        for(int i=0; i<loop; i++) {

            String n = br.readLine();
            StringTokenizer st = new StringTokenizer(n, " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (1 <= b && b <= 99 && 1 <= a && a <= 99 && 1 <= c && c <= a * b) {
                int floor = c%a;

                if (floor == 0) {
                    floor = a;
                }

                int room = (int) Math.ceil((double) c / a);
                if (room < 10) {
                    if (i == loop - 1) {
                        bw.write(floor + "0" + room);
                    } else {
                        bw.write(floor + "0" + room + "\n");
                    }
                } else {
                    if (i == loop - 1) {
                        bw.write(floor +""+ room);
                    } else {
                        bw.write(floor +""+ room + "\n");
                    }
                }
            }
        }
        bw.close();
    }
}
