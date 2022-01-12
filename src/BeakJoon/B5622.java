package BeakJoon;

import java.io.*;

public class B5622 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String arr[] = {"","","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV", "WXYZ"};
        String input = br.readLine();
        int result = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length(); j++){
                for(int x=0; x<input.length();x++) {
                    if (arr[i].substring(j,j+1).equals(input.substring(x,x+1))){
                        result += i;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
