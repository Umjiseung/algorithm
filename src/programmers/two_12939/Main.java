package programmers.two_12939;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("1 2 3"));
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] stringArr = s.split(" ");

        int[] intArr = new int[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
            intArr[i] = Integer.parseInt(stringArr[i]);
        }

        Arrays.sort(intArr);

        answer = intArr[0] + " " + intArr[intArr.length - 1];

        return answer;
    }
}