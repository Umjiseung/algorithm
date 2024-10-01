package baekjoon.silver.s_1158;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            queue.add(i+1);
        }

        StringBuilder sb = new StringBuilder();
        System.out.print("<");
        while (!queue.isEmpty()) {
            for (int i = 0; i < K-1; i++) {
                queue.add(queue.remove());
            }
            if (queue.size() == 1) {
                sb.append(queue.remove() + ">");
                break;
            }
            sb.append(queue.remove()).append(", ");
        }
        System.out.println(sb);
    }
}
