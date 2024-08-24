package baekjoon.bronze.b_2033;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int p = 0;

        if (n % 10 > 4) {
            p = (n / 10 + 1) * 10;
        }
        for (int i = 10; i <= n; i = i * 10) {
            p = (n / i + 1) * i;
        }

        System.out.println(p);
    }
}
