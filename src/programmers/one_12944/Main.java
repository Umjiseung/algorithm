package programmers.one_12944;

import java.util.Scanner;

public class Main {
}

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for (int j : arr) {
            answer += j;
        }

        answer = answer / arr.length;

        return answer;
    }
}