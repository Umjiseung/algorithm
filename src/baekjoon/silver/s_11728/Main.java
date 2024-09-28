package baekjoon.silver.s_11728;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] A = new int[n];
        int[] B = new int[m];
        int[] ALL = new int[n + m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n + m; i++) {
            if (i < n) {
                ALL[i] = A[i];
            } else {
                ALL[i] = B[i - n ];
            }
        }

        Arrays.sort(ALL);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ALL.length; i++) {
            sb.append(ALL[i] + " ");
        }

        System.out.println(sb);
    }
}
