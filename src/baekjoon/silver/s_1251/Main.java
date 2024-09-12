package baekjoon.silver.s_1251;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        String[] ar = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ar[i] = String.valueOf(s.charAt(i));
        }

        Arrays.sort(ar);

        for (int i = 0; i < ar.length; i++) {
            System.out.printf(ar[i]);
        }

    }
}
