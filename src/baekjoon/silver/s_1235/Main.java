package baekjoon.silver.s_1235;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        BigInteger[] a = new BigInteger[n];

        for (int i = 0; i < n; i++) {
            a[i] = new BigInteger(br.readLine().trim());
        }

        int num = 2;

        for (int i = 100; true; i *= 10) {
            BigInteger[] b = new BigInteger[n];
            BigInteger[] copyB = new BigInteger[n];
            for (int p = 0; p < n; p++) {
                b[p] = a[p].mod(BigInteger.valueOf(i));
                copyB[p] = b[p];
            }
            Arrays.sort(b);
            if (Arrays.equals(b, copyB)) {
                break;
            }
            num++;
        }

        System.out.println(num);
    }
}