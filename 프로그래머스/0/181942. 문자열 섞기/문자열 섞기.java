class Solution {
    //메서드에 타입 필수
    public String solution(String str1, String str2){
        int a = str1.length();
        String result = "";
        for(int i = 0; i < a; i++){
            char p = str1.charAt(i);
            char q = str2.charAt(i);
            result = result + p + q;
        }
        return result;
    }
}