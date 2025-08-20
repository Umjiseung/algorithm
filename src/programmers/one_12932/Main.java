package programmers.one_12932;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(123);
    }
}

class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);

        int[] answer = new int[str.length()];
        int index = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            answer[index] = Integer.parseInt(String.valueOf(str.charAt(i)));
            index++;
        }

        return answer;
    }
}
