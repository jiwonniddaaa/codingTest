class Solution{
    public int solution(int num, int n){
        // int answer = num % n == 0 ? 1 : 0; 삼항연산자 쓸 수도 있음
        if (num % n == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}