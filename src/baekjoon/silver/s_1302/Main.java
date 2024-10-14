package baekjoon.silver.s_1302;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] stringArray = new String[n];
        Set<String> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            stringArray[i] = br.readLine();
            set.add(stringArray[i]);
        }

        int big = 0;
        for (String i: set) {
            for (int j = 0; j < n; j++) {
                if (i.equals(stringArray[j])) {
                    map.put(stringArray[j], map.getOrDefault(stringArray[j], 0) + 1);
                    if (map.get(stringArray[j]) > big) {
                        big = map.get(stringArray[j]);
                    }
                }
            }
        }

        String sum = "";
        List<String> list = new ArrayList<>();


        for (String i: set) {
            if (big == map.get(i)) {
                list.add(i);
            }
        }

        if (!list.isEmpty()) {
            String[] strings = list.toArray(new String[list.size()]);
            Arrays.sort(strings);

            for (int i = 0; i < strings.length; i++) {
                System.out.println(strings[i]);
                System.exit(0);
            }
        }

        int count = 0;
        for (String i: set) {
            if (map.get(i) > count) {
                count = map.get(i);
                sum = i;
            }
        }

        System.out.println(sum);
    }
}