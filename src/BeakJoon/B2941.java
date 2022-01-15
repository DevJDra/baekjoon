package BeakJoon;

import java.io.*;

public class B2941 {
    public static void main(String args[]) throws IOException {

        String[] arr = {"c=", "c-", "dz=", "d-", "lj","nj","s=","z="};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine().trim();

        for(int i=0; i<arr.length; i++){
            if(input.contains(arr[i])){
                input = input.replaceAll(arr[i], "*");
            }
        }

        int result = input.length();

        bw.write(result + "");
        bw.close();

    }
}
