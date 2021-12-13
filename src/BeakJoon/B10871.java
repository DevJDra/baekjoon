package BeakJoon;

import java.io.*;
import java.util.StringTokenizer;

public class B10871 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String value = br.readLine();
        //N과 X를 입력 후 StringTokenizer로 공백 제거
        StringTokenizer st = new StringTokenizer(value, " ");
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());


        if(1<=N && X<=10000){
            //입력값 입력
            String I = br.readLine();
            //split으로 공백 제거후 배열에 저장
            String[] arr = I.split(" ");

            //배열의 값을 꺼냄
            for(String arr2 : arr){
                //X보다 작은 조건만
                if(Integer.parseInt(arr2) < X){
                    //출력
                    bw.write(arr2+" ");
                }
            }
        }
        bw.flush();
    }
}
