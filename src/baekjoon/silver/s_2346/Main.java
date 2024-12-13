package baekjoon.silver.s_2346;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<int[]> deque = new ArrayDeque<>();

        int a;
        for (int i = 0; i < n; i++) {
            a = Integer.parseInt(st.nextToken());

            deque.add(new int[]{i + 1, a});
        }

        int[] dq;

        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {

            dq = deque.pollFirst();

            if (dq[1] > 0) {
                for (int j = 1; j < dq[1]; j++) {
                    if (deque.isEmpty()) {break;}
                    deque.addLast(deque.pollFirst());
                }
                sb.append(dq[0]).append(" ");
            } else {
                int b = dq[1] * -1;

                for (int j = 1; j <=b; j++) {
                    if (deque.isEmpty()) {break;}
                    deque.addFirst(deque.pollLast());
                }
                sb.append(dq[0]).append(" ");
            }
        }


        System.out.println(sb);
    }
}
