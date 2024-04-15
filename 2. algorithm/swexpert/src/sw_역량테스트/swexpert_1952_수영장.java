package sw_역량테스트;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swexpert_1952_수영장 {
    static int[] price = new int[3];
    static int[] monthlyPlan = new int[12];
    static int[] cost = new int[12];
    static int minCost;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());

        for (int t = 1; t <= testCase; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 3; i++) {
                price[i] = Integer.parseInt(st.nextToken());
            }
            // 우선 일년권을 최소금액으로 잡아둔다.
            minCost = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 12; i++) {
                monthlyPlan[i] = Integer.parseInt(st.nextToken());
            }            
            recur(0);
            sb.append("#"+t+" "+minCost+"\n");
        }
        System.out.println(sb);
    }

    private static void recur(int idx) {
        // base Case
        if (idx >= 12) {            
            int sum=0;
            for(int s : cost){
                sum+=s;
            }
            minCost = Math.min(minCost, sum);            
            return;
        }
        // recursive Case
        if (monthlyPlan[idx] == 0) {
            recur(idx + 1);
        } else {
            cost[idx] = monthlyPlan[idx] * price[0];            
            recur(idx + 1);
            cost[idx] = price[1];            
            recur(idx + 1);
            cost[idx] = price[2];            
            recur(idx + 3);
        }

    }
}
