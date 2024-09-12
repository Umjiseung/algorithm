package baekjoon.silver.s_2161;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            q.add(i + 1);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (q.size() == 1) {
                sb.append(q.remove());
                break;
            }

            sb.append(q.remove() + " ");
            q.add(q.remove());
        }
        System.out.println(sb);
    }
}
