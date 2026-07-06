class Solution {
    public String solution(String n_str) {
        int i = 0;
        while(n_str.charAt(i) == '0'){
            n_str = n_str.substring(1, n_str.length());
        }
        return n_str;
    }
}