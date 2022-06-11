package BeakJoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class B1181 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for(int i=0; i<n; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            }
        });

//        int compare;
//        for(int i=1; i<n; i++) {
//            for(int j=0; j<n-i; j++){
//                if(arr[j].length() > arr[j+1].length()) {
//                    //길이순 정렬
//                    swap(arr, j, j+1);
//                }
//                else if(arr[j].length() == arr[j+1].length()){
//                    //사전순 정렬
//                    compare = arr[j].compareTo(arr[j+1]);
//                    if (compare > 0) {
//                        swap(arr, j, j+1);
//                    }
//                }
//            }
//        }
        //배열 중복 제거
        String[] resultArr = Arrays.stream(arr).distinct().toArray(String[]::new);

        for(int i=0; i<resultArr.length; i++){
            bw.write(resultArr[i] + "\n");
        }
        bw.close();
    }
//    //배열 swap
//    private static void swap(String[] arr, int i, int j){
//        String temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
}
