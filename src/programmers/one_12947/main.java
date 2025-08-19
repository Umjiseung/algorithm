package programmers.one_12947;

public class main {
}
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = String.valueOf(x);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int a = Integer.parseInt(String.valueOf(str.charAt(i)));
            sum += a;
        }

        if (x % sum != 0) {
            answer = false;
        }

        return answer;
    }
}
