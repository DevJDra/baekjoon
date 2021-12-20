package BeakJoon;

import java.io.*;

public class B14681 {

    public static void main(String[] args) throws  IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(bf.readLine());
        int y = Integer.parseInt(bf.readLine());

        if(x > 0 && y > 0){
            bw.write("1");
        }
        else if (x < 0 && y > 0){
            bw.write("2");
        }
        else if (x < 0 && y < 0){
            bw.write("3");
        }
        else{
            bw.write("4");
        }
        bw.close();

    }
}