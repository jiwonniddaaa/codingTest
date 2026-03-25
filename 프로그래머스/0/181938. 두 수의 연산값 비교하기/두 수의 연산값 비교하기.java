class Solution{
    public int solution(int a, int b){
        String p = String.valueOf(a) + String.valueOf(b);
        int c = Integer.parseInt(p);
        int d = 2 * a * b;
        return Math.max(c, d);
    }
}