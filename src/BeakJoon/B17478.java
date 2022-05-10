package BeakJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class B17478 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String dash = "";
        List<String> list = new ArrayList<>();

        String loop1 = "\"재귀함수가 뭔가요?\"";
        String loop2 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
        String loop3 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
        String loop4 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
        String loop5 = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
        String loop6 = "라고 답변하였지.";
        list.add(loop1);
        list.add(loop2);
        list.add(loop3);
        list.add(loop4);
        list.add(loop5);
        list.add(loop6);

        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        for(int i=0; i<=N; i++){
            if(i == N && N != 0){
                System.out.println(dash + list.get(0));
                System.out.println(dash + list.get(4));
            }else{
                for(int j=0; j<4; j++){
                    System.out.println(dash + list.get(j));
                }
            }
            dash += "____";
        }

        for(int i=N; i>=0; i--){
            if(dash.length() >= 4) {
                dash = dash.substring(0, dash.length() - 4);
            }
            System.out.println(dash + list.get(5));
        }
    }
}
