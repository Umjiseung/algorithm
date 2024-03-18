package baekjoon.bronze.b_14720;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bw.readLine(), " ");

        int num = Integer.parseInt(st.nextToken()); // 우유 가게의 개수를 정상적으로 읽어옴

        st = new StringTokenizer(bw.readLine(), " ");


        int[] a = new int[num];


        for (int i = 0; i < num; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int b = 0, milk = 0;

        for (int i = 0; i < num; i++) {
            if (a[i] == milk) {
                b++;
                milk = (++milk) % 3;
            }
        }

        System.out.println(b);

    }
}
