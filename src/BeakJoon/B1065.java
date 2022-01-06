package BeakJoon;

import java.io.*;

public class B1065 {

    public static void main(String args[]) throws IOException{
        int count = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String loop = br.readLine();
        bw.write(String.valueOf(oneNumber(loop)));
        bw.close();

    }

    public static int oneNumber(String loop){

        int count = 0;
        int[] arr = new int[loop.length()];
        int loops = Integer.parseInt(loop);

        for(int i=1; i<=loops; i++){
            int num = 0;

            if(i<100){
                count++;
            }else{
                int cnt = i;
                int arrCnt = 0;

                while(cnt != 0){
                    num = cnt % 10;
                    arr[arrCnt] = num;
                    cnt = cnt/10;
                    arrCnt++;
                }
                if(i<1000) {
                    for (int j = 0; j < 1; j++) {
                        if (arr[j + 1] - arr[j] == arr[j + 2] - arr[j + 1]) {
                            count++;
                        }
                    }
                }else{
                    for (int j = 0; j < 1; j++) {
                        if (arr[j + 1] - arr[j] == arr[j + 2] - arr[j + 1] &&
                                arr[j+2] - arr[j+1] == arr[j+3] - arr[j+2]) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    };
}
