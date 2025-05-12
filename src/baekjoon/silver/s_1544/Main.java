package baekjoon.silver.s_1544;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str;
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            str = br.readLine();
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            str = new String(charArr);
            set.add(str);
        }

        int count = 0;
        for (String s : set) {
            count++;
        }

        System.out.println(count);

    }
}
