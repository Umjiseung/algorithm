package baekjoon.silver.s_1676;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int twoNum = 0;
        int fiveNum = 0;

        for (int i = 2; i <= N; i++) {
            int power = i;
            if (i == 2) {
                while (power <= N) {
                    twoNum += N / power;
                    power *= i;
                }
            }
            if (i == 5) {
                while (power <= N) {
                    fiveNum += N / power;
                    power *= i;
                }
            }
        }

        int result = Math.min(twoNum, fiveNum);

        System.out.println(result);
    }
}
