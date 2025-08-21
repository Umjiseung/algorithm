package programmers.two.two_12909;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(")()("));
    }

}

class Solution {
    boolean solution(String s) {
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')'){
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }

        return count == 0;
    }
}