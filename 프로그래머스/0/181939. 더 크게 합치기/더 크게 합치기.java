class Solution{
    public int solution(int a, int b){
        String str1 = String.valueOf(a) + String.valueOf(b);
        String str2 = String.valueOf(b) + String.valueOf(a);
        int p = Integer.parseInt(str1);
        int q = Integer.parseInt(str2);
        return Math.max(p, q);
    }
}