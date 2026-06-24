class Solution {
    public String solution(String str1, String str2){
        int n = str1.length();
        String result = "";
        for(int i = 0; i < n; i++){
            char p = str1.charAt(i);
            char q = str2.charAt(i);
            result = result + p + q;
        }
        return result;
    }
}