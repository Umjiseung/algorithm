package programmers.two.two_12951;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("3people unFollowed me "));
    }
}

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        answer.append(Character.toUpperCase(s.charAt(0)));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i- 1) == ' ') {
                answer.append(Character.toUpperCase(s.charAt(i)));
            } else if (s.charAt(i - 1) != ' ' && s.charAt(i) != Character.toLowerCase(s.charAt(i))) {
                  answer.append(Character.toLowerCase(s.charAt(i)));
            } else {
                answer.append(s.charAt(i));
            }
        }


        return answer.toString();
    }
}
