package BeakJoon;

import java.io.*;
import java.util.StringTokenizer;

public class B1929 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input, " ");

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] prime = new int[N+1];

        prime[0] = prime[1] = 0;

        for(int i=2; i<=N; i++){
            prime[i] = i;
        }

        for(int i=2; i*i<=N; i++){ //2부터 숫자를 키워가며 배수들을 제외(0 할당)
            if(prime[i] == 0) continue;
            for(int j = i*i; j<=N; j+=i){
                prime[j] = 0; //2를 제외한 2의배수 0할당
            }
        }

        for(int i=M; i<prime.length; i++){
            if(prime[i] != 0){
                bw.write(String.valueOf(i)+"\n");
            }
        }
        bw.close();
    }
}
