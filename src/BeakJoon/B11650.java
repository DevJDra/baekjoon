package BeakJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11650 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.valueOf(br.readLine());

        int[][] arr = new int[count][2];
        //StringTokenizer로 공백을 잘라 2차원 배열에 삽입
        for(int i=0; i<count; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");

            arr[i][0] = Integer.valueOf(st.nextToken());
            arr[i][1] = Integer.valueOf(st.nextToken());
        }
        //2차원 배열 정렬
        Arrays.sort(arr, (o1,o2) -> {
            if(o1[0] == o2[0]){
                return Integer.compare(o1[1], o2[1]);
            } else {
                return Integer.compare(o1[0], o2[0]);
            }
        });
        //출력
        for(int i=0; i<count; i++) {
            bw.write(String.valueOf(arr[i][0]) + " " + String.valueOf(arr[i][1]) +"\n");
        }
        bw.close();
    }
}
