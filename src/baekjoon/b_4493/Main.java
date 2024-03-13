package baekjoon.b_4493;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i < a; i++) {
            int b = Integer.parseInt(br.readLine());
            int p1 = 0;
            int p2 = 0;
            for (int j = 0; j < b; j++) {
                String[] arr = new String[]{br.readLine()};
                switch (arr[0].charAt(0)) { // R 바위 P 보 S 가위
                    case 'R':
                        if (Objects.equals(arr[0].charAt(2), 'P')){
                            p2++;
                            break;
                        }
                        else if (Objects.equals(arr[0].charAt(2), 'S')){
                            p1++;
                            break;
                        } else
                            break;

                    case 'P':
                        if (Objects.equals(arr[0].charAt(2), 'S')){
                            p2++;
                            break;
                        }
                        else if (Objects.equals(arr[0].charAt(2), 'R')) {
                            p1++;
                            break;
                        } else
                            break;


                    case 'S':
                        if (Objects.equals(arr[0].charAt(2), 'R')) {
                            p2++;
                            break;
                        }
                        else if (Objects.equals(arr[0].charAt(2), 'P')){
                            p1++;
                            break;

                        } else
                            break;


                }
            }

            if (p1 < p2) {
                System.out.println("Player 2");
            } else if (p1 == p2){
                System.out.println("TIE");

            } else {
                System.out.println("Player 1");
            }
        }

    }

}
