package Gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_2493_탑 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        bw.write(0+" ");
        for (int i = 1 ; i < N; i++) {
            int idx = 0;
            for (int j = i-1; j >= 0; j--) {
                if (arr[j] >= arr[i]) {
                    idx = j+1;
                    break;
                }
            }
            bw.write(idx+" ");
        }
        bw.flush();
        bw.close();
    }
}
