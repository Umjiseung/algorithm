package baekjoon.silver.s_1822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] A = new int[a];
        int[] B = new int[b];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B.length; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }


        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < A.length; i++) {
            int t = 0;
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    t = 0;
                    break;
                } else if (A[i] != B[j]) {
                    t++;
                }
            }
            if (t > 0) {
                set.add(A[i]);
                sb.append(A[i]).append(" ");
            }
        }

        if (set.isEmpty()) {
            System.out.println(0);

        } else {
            System.out.println(set.size());
            System.out.println(sb);
        }
    }
}
