package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15650_N과M_2 {
    static int N, M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        combination(0, 0);
        System.out.println(sb);

    }

    private static void combination(int idx, int sidx) {        
        // base Case
        if (sidx == M) {
            for(int i : arr){
                sb.append(i).append(" ");
            }            
            sb.append("\n");
            return;
        }
        // recursive Case
        for (int i = 0; i < N; i++) {            
            arr[sidx] = i+1;
            combination(i + 1, sidx + 1);
        }
    }

}
