package baekjoon.silver.s_2822;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[8];
        int[] standard = new int[8];

        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            standard[i] = arr[i];
        }

        Arrays.sort(arr);

        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for(int i = 3; i < arr.length; i++) {
            sum += arr[i];
            for (int j = 0; j < standard.length; j++) {
                if (arr[i] == standard[j]) {
                    set.add(j + 1);
                }
            }
        }

        System.out.println(sum);
        StringBuilder sb = new StringBuilder();
        for (Integer i : set) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
