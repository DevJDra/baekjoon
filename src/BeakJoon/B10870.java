package BeakJoon;

import java.io.*;

public class B10870 {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()) + 1;
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            if(i == 0){
                arr[i] = 0;
            }else if(i == 1){
                arr[i] = 1;
            }else{
                arr[i] = arr[i-2] + arr[i-1];
            }
        }
        int result = arr[n-1];
        bw.write(String.valueOf(result));
        bw.close();
    }
}
