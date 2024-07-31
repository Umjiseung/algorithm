package baekjoon.bronze.b_1357;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        x = rev(x);
        y = rev(y);
        int sum = rev(x + y);

        System.out.println(sum);
    }

    private static int rev(int num) {
        if (num >= 1000) {
            int first = num / 1000;
            int second = num / 100 - first * 10;
            int third = num / 10 - (first * 100 + second * 10);
            int four = num % 10;

            return four * 1000 + third * 100 + second * 10 + first;
        } else if (num >= 100) {
            int first = num / 100;
            int second = num / 10 - first * 10;
            int third = num % 10;

            return third * 100 + second * 10 + first;
        } else if (num >= 10) {
            int first= num / 10;
            int second = num % 10;

            return second * 10 + first;
        } else {
            return num;
        }
    }
}
