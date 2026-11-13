class Solution {
    public int[] solution(long n) {
        //String을 int로 바꿀 때 Integer.parseInt();
        //숫자를 문자열로 바꿀 때 String.valueOf(n), Long.toString(n)
        String ns = String.valueOf(n);
        int[] answer = new int[ns.length()];
        for(int i = 0; i < ns.length(); i++){
            answer[ns.length() - i - 1] = ns.charAt(i) - '0';
        }
        return answer;
    }
}