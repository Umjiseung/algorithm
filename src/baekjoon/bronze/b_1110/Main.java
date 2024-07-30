package baekjoon.bronze.b_1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = Integer.parseInt(br.readLine());
        int cycle = 0;

        int firstPlace = i / 10;
        int lastPlace = i % 10;
        int newNumber;
        do {
            newNumber = firstPlace + lastPlace;
            newNumber = lastPlace * 10 + newNumber % 10;
            firstPlace = newNumber / 10;
            lastPlace = newNumber % 10;
            cycle++;
        } while (newNumber != i);

        System.out.println(cycle);
    }
}
