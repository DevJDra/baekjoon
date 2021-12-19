package BeakJoon;

//import java.io.*;
//
//public class B1110 {
//
//    public static void main(String args[]) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String n = br.readLine();
//        int correct = Integer.parseInt(n);
//
//        String a = "";
//        String b = "";
//        int i = 0;
//        String result = "";
//        while(true) {
//            if (n.length() > 1) {
//                a = n.substring(0, 1);
//                b = n.substring(1, 2);
//                result = String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
//            } else {
//                b = n.substring(0, 1);
//                result = String.valueOf(Integer.parseInt(b));
//            }
//            if(result.length() > 1){
//                result = result.substring(1,2);
//            }
//
//            n = b + result;
//            i++;
//            if(correct == Integer.parseInt(n)){
//                bw.write(String.valueOf(i));
//                break;
//            }
//        }
//        bw.close();
//    }
//}

import java.io.*;
import java.util.*;

public class B1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int count = 0;
        int result = number;
        do {
            result = ((result % 10) * 10) + (((result / 10) + (result % 10)) % 10);
            count++;
        } while (number != result);

        System.out.println(count);
    }
}
