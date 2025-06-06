package baekjoon.silver.s_1449;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        float L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int number = 0;
        for (int i = 1; i < N; i++) {
            if (arr[i - 1] == arr[i] - 1 || arr[i - 1] == arr[i] + 1) {
                number++;
            } else {
                number = number + 2;
            }
        }

        if (number % L != 0) {
            number = (int) ((number / L + 0.5F) + number % L + 0.5F);
        } else {
            number = (int) (number / L + 0.5F) + 1;
        }

        System.out.println(number);
    }
}
