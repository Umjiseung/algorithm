package baekjoon.bronze.b_2501;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int num = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = a; i > 0; i--) {
            if (a % i == 0) {
                arr.add(a / i);
                num++;
            }

        }
        if (b > num) {
            System.out.println(0);
        } else {
            System.out.println(arr.get(b - 1));
        }



    }
}
