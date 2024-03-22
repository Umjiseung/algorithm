package baekjoon.bronze.b_1284;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int a = Integer.parseInt(br.readLine());
            ArrayList<Integer> arrNum = new ArrayList<>();
            if (a == 0) break;
            int length = (int)(Math.log10(a) + 1 + 1);
            while(a > 0) {
                arrNum.add(a %10);
                a /= 10;
            }
            for (int i = 0; i < arrNum.size(); i++) {
                switch (arrNum.get(i)){
                    case 0:
                        length += 4;
                        break;

                    case 1:
                        length += 2;
                        break;

                    default:
                        length += 3;
                        break;
                }
            }
            System.out.println(length);
        }

        br.close();
    }
}
