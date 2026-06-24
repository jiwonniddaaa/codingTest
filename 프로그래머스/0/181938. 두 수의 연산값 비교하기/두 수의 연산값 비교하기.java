class Solution{
    public int solution(int a, int b){
        String result = "";
        String p = String.valueOf(a) + String.valueOf(b);
        int n = Integer.parseInt(p);
        int m = 2 * a * b;
        return Math.max(n, m);
    }
}