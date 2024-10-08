package baekjoon.silver.s_11931;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Integer[] a = new Integer[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(a, (c,b) -> b-c);

        for (int i = 0; i < n;i++) {
            bw.write(a[i] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
