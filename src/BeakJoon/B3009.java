package BeakJoon;

import java.io.*;
import java.util.StringTokenizer;

public class B3009 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr = new String[3];
        String[] arr2 = new String[3];

        for(int i=0; i<3; i++){
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");

            arr[i] = st.nextToken();
            arr2[i] = st.nextToken();
        }

        for(int i=0; i<1; i++){
            for(int j=1; j<2; j++){
                if(!(arr[1].equals(arr[2]))){
                    if(!(arr[i].equals(arr[j]))) {
                        bw.write(arr[j] + " " );
                    }else{
                        bw.write(arr[j+1] + " " );
                    }
                }else{
                    bw.write(arr[0] + " ");
                }
                if(!(arr2[1].equals(arr2[2]))){
                    if(!(arr2[i].equals(arr2[j]))) {
                        bw.write(arr2[j] + " " );
                    }else{
                        bw.write(arr2[j+1] + " " );
                    }
                }else{
                    bw.write(arr2[0] + " ");
                }
            }
        }
        bw.close();
    }
}
