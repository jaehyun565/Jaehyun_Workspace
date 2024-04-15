package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_1021_회전하는큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int cnt = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (list.peekFirst() == a) {
                list.pollFirst();
                continue;
            }
            int idx = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == a) {
                    idx = j;
                }
            }

            int left = Math.abs(idx - 0);
            int right = Math.abs(idx - (list.size()));
            if (left > right) {
                for (int j = 0; j < right; j++) {
                    list.addFirst(list.pollLast());
                }
                list.pollFirst();
                cnt += right;
            } else {
                for (int j = 0; j < left; j++) {
                    list.addLast(list.pollFirst());
                }
                list.pollFirst();
                cnt += left;
            }
        }
        System.out.println(cnt);
    }
}
