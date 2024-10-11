package baekjoon.gold.g_1188;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        System.out.println(M - getGcd(N, M));
    }

    public static int getGcd(int a, int b) {
        if (a % b == 0)
            return b;

        return getGcd(b, a % b);
    }
}
