package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_6033_로또 {
    static int[] arr;
    static int[] tmp;
    static int k;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        tmp = new int[6];
        while (true) {
            k = Integer.parseInt(st.nextToken());
            arr = new int[k];
            for (int i = 0; i < k; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            lotto(0, 0);
            st = new StringTokenizer(br.readLine());
            if(st.countTokens() == 1) break;
            sb.append("\n");
        }
        System.out.println(sb);

    }

    public static void lotto(int idx, int sidx) {
        // base Case
<<<<<<< HEAD
        if(sidx>=6){
            System.out.println(Arrays.toString(tmp));
            return;
        }
        
        if(idx >k){
            System.out.println(Arrays.toString(tmp));
=======
        if (sidx == 6) {
            for (int i = 0; i < 6; i++) {
                sb.append(tmp[i]).append(" ");
            }
            sb.append("\n");
>>>>>>> 53f3ce759d3da7afeaaa3ecda817d58151b3cb65
            return;
        }

        // recursive Case
        for (int i = idx; i < k; i++) {
            tmp[sidx] = arr[i];
            lotto(i + 1, sidx + 1);
        }

    }
}
