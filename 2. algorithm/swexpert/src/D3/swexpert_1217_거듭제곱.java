package D3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swexpert_1217_거듭제곱 {
    static int num1;
    static int num2;
    static int answer;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        int testCase = 10;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int t = 1; t<=testCase; t++){
            int testNum = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());
            answer = 1;
            sb.append("#").append(testNum).append(" ");
            power(0);            
        }
        System.out.println(sb);
    }

    private static void power(int idx){   
        // basecase
        if(idx == num2){
            sb.append(answer).append("\n");
            return;
        }
        // recursive case
        answer*=num1;
        power(idx+1);
    }
}
