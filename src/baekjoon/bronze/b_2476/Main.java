package baekjoon.bronze.b_2476;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int money = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            money = 0;
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == b && b == c) {
                money += 10000 + (a * 1000);
                arr[i] = money;
            } else if (a == b || b == c || a == c) {
                if (a == b) {
                    money += 1000 + (a * 100);
                    arr[i] = money;
                } else if (b == c) {
                    money += 1000 + (b * 100);
                    arr[i] = money;
                } else {
                    money += 1000 + (c * 100);
                    arr[i] = money;
                }
            } else {
                int bigNum = Math.max(a, b);
                bigNum = Math.max(bigNum, c);
                money += bigNum * 100;
                arr[i] = money;
            }
        }

        int bigNum = arr[0];
        for (int i = 1; i < n; i++) {
            if (bigNum < arr[i])
                bigNum = arr[i];
        }
        bw.write(String.valueOf(bigNum));
        bw.flush();
        bw.close();
        br.close();
    }
}
