package BeakJoon;

import java.io.*;

public class B2577 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result =  Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        int length = (int)(Math.log10(result)+1); //int형 자릿수
        int arr[] = new int[10];

        while(result > 0){
            arr[result % 10]++;
            result /= 10;
        }

        for(int arr2 : arr){
            bw.write(String.valueOf(arr2));
            bw.write("\n");
        }
        bw.close();
    }
}
