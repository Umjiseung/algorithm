package programmers.one.one_12933;

import java.util.Arrays;

public class Main {
}

class Solution {
    public long solution(long n) {
        String str = String.valueOf(n);
        char[] charArr= str.toCharArray();

        Arrays.sort(charArr);

        String answer = "";
        for (int i = charArr.length - 1; i >= 0; i--) {
            answer += String.valueOf(charArr[i]);
        }

        return Long.parseLong(answer);
    }
}
