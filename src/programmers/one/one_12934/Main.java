package programmers.one.one_12934;
// https://school.programmers.co.kr/learn/courses/30/lessons/12934
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public long solution(long n) {
        long answer = 0;

        double ja = Math.sqrt(n);

        if (ja > (long) ja) {
            answer = -1;
        } else {
            answer = (long) Math.pow(ja + 1, 2);
        }

        return answer;
    }
}
