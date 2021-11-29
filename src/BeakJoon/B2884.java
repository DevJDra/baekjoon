package BeakJoon;

import java.io.*;
import java.util.StringTokenizer;

public class B2884 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String time = bf.readLine();
        //readLine은 한 행을 전부 읽기 때문에 공백 단위로 입력한 문자열을 분리 해주어야함.
        StringTokenizer st = new StringTokenizer(time, " ");
        //StringTokenizer 클래스를 이용해 분리 해준다.

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        //st.nextToken()은 문자열을 반환하기 때문에 int형으로 변환

        if(minute >= 45) { //45분 이상인 경우
            minute -= 45;
            bw.write(hour + " " + minute);
        }
        else if(minute < 45){ //45분 미만인 경우

            if ( hour == 0) { // 시간이 0시간일때
                hour = 23;
            }else{
                hour -= 1;
            }
            int minus = minute - 45;
            minute = 60 + minus;

            bw.write(hour + " " + minute);
        }
        bw.flush();
        bw.close();
    }
}
