package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_1475_방번호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String roomNum = br.readLine();
        char[] c = roomNum.toCharArray();
        int[] count = new int[10];
        int set = 0;
        
        for (int i = 0; i < c.length; i++) {
            count[c[i] - 48]++;
        }
        int a = (count[6] + count[9] + 1) / 2;
        int b = 0;
        for (int i = 0; i < count.length; i++) {
            if (i == 6 || i == 9)
                continue;
            if (b < count[i]) {
                b = count[i];
            }
        }
        if (a < b) {
            a = b;
        }
        System.out.println(a);
    }
}
