package baekjoon.bronze.b_1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputString = br.readLine();

        char[] charArr = inputString.toUpperCase().toCharArray();
        Set<Character> set = new HashSet<>();

        Map<Character, Integer> map = new HashMap<>();
        for (char value : charArr) {
            set.add(value);
        }

        for (Character set1: set) {
            map.put(set1, map.getOrDefault(set1, 0));
        }

        for (char c : charArr) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
        }

        int highNumber = 0;
        char highChar = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > highNumber) {
                highNumber = entry.getValue();
                highChar = entry.getKey();
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getKey() != highChar && entry.getValue() == highNumber) {
                highChar = '?';
                System.out.println(highChar);
                break;
            }
        }

        if (highChar != '?') {
            System.out.println(highChar);
        }
    }
}
