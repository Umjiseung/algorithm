package baekjoon.silver.s_1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        Integer[] arr = new Integer[n.length()];

        for (int i = 0; i < n.length(); i++) {
            arr[i] = Integer.valueOf(String.valueOf(n.charAt(i)));
        }

        Arrays.sort(arr, (a,b) -> b-a);

        for (int i = 0; i < n.length();i++) {
            System.out.print(arr[i]);
        }
    }
}