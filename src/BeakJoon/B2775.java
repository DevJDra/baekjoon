package BeakJoon;

import java.io.*;

public class B2775 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i=0; i<cnt; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[k+1][n];

            for(int x=0; x<=k; x++){
                for(int y=0; y<n; y++){
                    if(x == 0){
                        arr[x][y] = y+1;
                    }else{
                        if(y == 0){
                            arr[x][y] = arr[x-1][y];
                        }else{
                            arr[x][y] = arr[x-1][y]+arr[x][y-1];
                        }
                    }
                }
            }
            result = arr[k][n-1];
            bw.write(String.valueOf(result)+"\n");
        }
        bw.close();
    }
}
