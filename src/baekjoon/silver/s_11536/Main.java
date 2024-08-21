package baekjoon.silver.s_11536;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());

        String[] list = new String[a];
        String[] list2 = new String[a];

        for (int i = 0; i < a; i++) {
            list[i] = br.readLine();
            list2[i] = list[i];
        }

        Arrays.sort(list);

        if (Arrays.equals(list, list2)) {
            System.out.println("INCREASING");
            return;
        }

        Arrays.sort(list, Collections.reverseOrder());

        if (Arrays.equals(list, list2)) {
            System.out.println("DECREASING");
        } else {
            System.out.println("NEITHER");
        }
    }
}
