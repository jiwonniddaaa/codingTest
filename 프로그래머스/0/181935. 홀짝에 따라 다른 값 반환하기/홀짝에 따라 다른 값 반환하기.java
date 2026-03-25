class Solution {
    public int solution(int n) {
        // answer은 한번만 선언하도록(기본값 0), for문 안에 두면 무한으로 선언
        int answer = 0;
        if (n % 2 == 0) {
            for (int i = 2; i < n + 1; i += 2) {
                answer += (i * i);
            }
        }
        else {
            for (int i = 1; i < n + 1; i += 2) {
                answer += i;
            }
        }
        return answer;
    }
}