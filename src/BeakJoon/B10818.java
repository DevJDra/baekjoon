package BeakJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B10818 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input," ");

        int arr[] = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //java 배열 최대값 최소값 구하는법
        //for문을 이용한 방법
        int min = arr[0];
        int max = arr[0];

        for(int x=0; x < arr.length; x++){
            if(arr[x] < min){
                min = arr[x];
            }
        }

        for(int y=0; y < arr.length; y++){
            if(arr[y] > max){
                max = arr[y];
            }
        }
        bw.write(min + " " + max);
        bw.close();

        //array.sort() 이용한 방법
        Arrays.sort(arr);
        bw.write(arr[0] + " " + arr[arr.length-1]);
        bw.close();

        //Stream을 이용한 방법
        bw.write("최대값 : " + Arrays.stream(arr).max().getAsInt());
        bw.write("최소값 : " + Arrays.stream(arr).min().getAsInt());
        bw.close();
    }
}
