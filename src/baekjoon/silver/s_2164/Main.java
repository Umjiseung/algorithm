package baekjoon.silver.s_2164;

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

        for (int i = 0; i < n; i++) {
            if (q.size() == 1) {
                System.out.println(q.remove());
                break;
            }

            q.remove();
            q.add(q.remove());
        }
    }
}
