package baekjoon.silver.s_1269;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputA = Integer.parseInt(st.nextToken());
        int inputB = Integer.parseInt(st.nextToken());

        int[] a = new int[inputA];
        int[] b = new int[inputB];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        HashSet<Integer> setA = new HashSet<>();
        for (int num : a) {
            setA.add(num);
        }

        int countAB = 0;
        for (int num : b) {
            if (setA.contains(num)) {
                countAB++;
            }
        }

        countAB = a.length - countAB;

        HashSet<Integer> setB = new HashSet<>();
        for (int num : b) {
            setB.add(num);
        }

        int countBA = 0;
        for (int num : a) {
            if (setB.contains(num)) {
                countBA++;
            }
        }

        countBA = b.length - countBA;

        bw.write(String.valueOf( countAB + countBA));
        bw.flush();
        bw.close();
        br.close();
    }
}
