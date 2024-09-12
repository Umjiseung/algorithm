package baekjoon.silver.s_1817;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] += Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        int box = 0;
        for (int i = 1; i < n; i++) {
            if (a[i - 1] + a[i] > m) {
                box++;
            }

        }
        System.out.println(box);
    }
}
