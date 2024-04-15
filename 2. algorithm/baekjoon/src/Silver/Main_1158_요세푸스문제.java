package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1158_요세푸스문제 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] list = new int[N];
        int[] answer = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = i + 1;
        }

        int idx = 0;
        int cnt = 0;
        int a = 0;
        int b = 0;
        sb.append("<");
        while (a < N) {
            for (int i = idx; i < N; i = (i + 1) % N) {
                if (list[i] == 0)
                    continue;
                cnt++;
                if (cnt == K) {
                    idx = i;
                    break;
                }
            }

            sb.append(list[idx]+", ");
            answer[b++] = list[idx];
            list[idx] = 0;
            cnt = 0;
            a++;

        }
        sb.replace(sb.length()-2, sb.length(), ">");
        System.out.println(sb);
        
    }

}
