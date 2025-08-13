package baekjoon.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// a, b 비교하여 자리수를 뒤집은 후 크기 비교하여 큰 수를 자리수 뒤집은 걸로 출력
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine()); // 123456
        int b = Integer.parseInt(br.readLine()); // 535256

        int aDot = 1;
        int bDot = 1;

        int bigNum = 0;
        for (int i = 10; ;i = i * 10) {
            if (a / i != 0) {
                aDot += 1;
            }

            if (b / i != 0) {
                bDot += 1;
            }

            if (a / i == 0 && b / i == 0) {
                break;
            }

        }

        if (aDot != bDot) {
            bigNum = Math.max(a, b);
        }

        if (aDot == bDot) {
            Math.pow(10, aDot);
            for (int i = 10; i < Math.pow(10, aDot); i = i * 10) {
                if (i == 10) {
                    if (a % i != b % i) {
                        bigNum = a % i > b % i ? a : b;

                    }
                }
                if ((a / i) % 10 != (b / i) % 10) {
                    bigNum = (a / i) % 10 > (b / i) % 10 ? a : b;
                    break;
                }
            }
        }

        int[] arr = snapLogic(bigNum, bDot);
        for (int i = 0;i <= arr.length - 1; i++) {
            System.out.print(arr[i]);
        }


    }

    public static int[] snapLogic(int bigNum, int dot) {
        int[] a = new int[dot];
        a[0] = bigNum % 10;
        int m;
        int num = bigNum;
        for (int i = 1; i < a.length; i++) {
            m = num / 10 % 10;
            num = num / 10;

            a[i] = m;
            if (m == 0) {
                break;
            }


        }

        return a;
    }
}
