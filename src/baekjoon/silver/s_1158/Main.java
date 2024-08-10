package baekjoon.silver.s_1158;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int loop = 0;

        List<Integer> people = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        List<Integer> list = new ArrayList<>();
        while (!people.isEmpty()) {
            loop += k;
            System.out.println(k);
            System.out.println("loop = " + loop);

            if (loop > people.size() + 1) {
                loop -= n ;
                list.add(loop);
                people.remove(loop - 1);
            } else {
                list.add(people.get(loop - 1));
                people.remove(loop - 1);
            }
            System.out.println(people);
        }
        System.out.println(list);
        bw.flush();
        bw.close();
        br.close();
    }


}
