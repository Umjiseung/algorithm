package baekjoon.silver.s_9655;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        switch (n % 2) {
            case 0:
                bw.write("CY");
                break;

            case 1:
                bw.write("SK");
                break;
        }

        bw.flush();
    }
}
