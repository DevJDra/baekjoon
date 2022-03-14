package BeakJoon;

import java.io.*;
import java.util.stream.IntStream;

public class B9020 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());

        for(int i=0; i<loop; i++){

            int n = Integer.parseInt(br.readLine());
            int[] prime = new int[n+1];

            //소수가 아닐경우 0 (0,1은 소수가 아님)
            prime[0] = prime[1] = 0;

            //입력한 정수 크기만큼 반복하여 배열에 저장
            for(int j=2; j<=n; j++){
                prime[j] = j;
            }

            //2부터 숫자를 키워가며 배수들을 제외(0 할당)
            for(int j=2; j*j<=n; j++){
                if(prime[j] == 0) continue;
                //2를 제외한 2의배수 제외(0할당)
                for(int k = j*j; k<=n; k+=j){
                    prime[k] = 0;
                }
            }

            //3. 두 소수의 차이가 가장 작은것 부터 출력이므로 입력한 값의 중간부터 반복하여 출력한다.
            for(int x=prime.length/2; x>0; x--){
                if(prime[x] != 0){
                    //1. 소수의 합이 n이므로 역으로 (n-소수)를 계산한 후
                    int result = n - prime[x];
                    //2. 남은 배열에서 (n-소수)와 일치하는 값이 있을 경우 출력한다.
                    if(IntStream.of(prime).anyMatch(t -> t == result)){
                        bw.write(String.valueOf(prime[x] + " " + result) +"\n");
                        break;
                    }
                }
            }
        }
        bw.close();
    }
}
