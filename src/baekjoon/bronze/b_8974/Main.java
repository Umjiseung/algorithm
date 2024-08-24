package baekjoon.bronze.b_8974;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 1000; i++) {
            for (int p = 1; p <=i; p++) {
                list.add(i);
            }
        }

        int sum = 0;

        for (int i = a; i <= b;i++) {
            sum += list.get(i - 1);
        }
        System.out.println(sum);
    }
}
