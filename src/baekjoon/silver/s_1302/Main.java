package baekjoon.silver.s_1302;

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

        int n = Integer.parseInt(br.readLine());

        String[] books = new String[n];

        for (int i = 0; i < n; i++) {
            books[i] = br.readLine();
        }

        Set<String> bookSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            bookSet.add(books[i]);
        }

        Map<String, Set<String>> map = new HashMap<>();

        for (String book : bookSet) {
            map.put(book, new HashSet<>());
        }

        for (int i = 0; i < n; i++) {
            if (map.containsKey(books[i])) {
                map.get(books[i]).add(books[i]);
            }
        }


        String mostBook;
        for (String book : bookSet) {

            if (map.containsKey(book)) {

            }
        }
    }
}
