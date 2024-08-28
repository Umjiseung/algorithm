package baekjoon.silver.s_2635;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int x = n / 2;

        List<Integer> list = new ArrayList<>();
        list.add(n);
        list.add(x);
        int trys = 2;
        while (n > 0) {
            n -= x;
            if (n < 0)
                break;
            trys++;
            list.add(n);

            x -= n;
            if (x < 0)
                break;
            trys++;
            list.add(x);
        }
        System.out.println(trys);
        System.out.println(list);
    }
}
