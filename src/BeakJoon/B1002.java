package BeakJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1002 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for(int i=0; i<count; i++){
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");

            int[] arr = new int[2];
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            int a1 = x1+r1;
            int a2 = x1-r1;
            int a3 = y1+r1;
            int a4 = y1-r1;
            int b1 = x2+r2;
            int b2 = x2-r2;
            int b3 = y2+r2;
            int b4 = y2-r2;

            if(a1 > b1){
                if(a2 < b2){
                    arr[0] = 0;
                }else if(a2 > b2){
                    arr[0] = 2;
                }else{
                    arr[0] = 1;
                }
            }else if(a1 < b1){
                if(b2 > a2){
                    arr[0] = 0;
                }else if(b2 < a2){
                    arr[0] = 2;
                }else{
                    arr[0] = 1;
                }
            }else{
                arr[0] = 1;
            }

            if(a3 > b3){
                if(a4 < b4){
                    arr[1] = 0;
                }else if(a4 > b4){
                    arr[1] = 2;
                }else{
                    arr[1] = 1;
                }
            }else if(a3 < b3){
                if(a4 > b4){
                    arr[1] = 0;
                }else if(a4 < b4){
                    arr[1] = 2;
                }else{
                    arr[1] = 1;
                }
            }else{
                arr[1] = 1;
            }

            Integer maxValue = Arrays.stream(arr).max().getAsInt();
            bw.write(String.valueOf(maxValue) +"\n");
        }
        bw.close();
    }

    public static int ChkCase(int param1, int param2){
        int count = 0;

        if(param1 <= param2) {
            if(param1 == param2){
                count = 1;
            }else{
                count = 2;
            }
        }else{
            count = 0;
        }
        return count;
    }
}
