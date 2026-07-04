class Solution{
    public int solution(String myString, String pat){
        int result = 0;
        int idx = 0;
        
        while((idx = myString.indexOf(pat, idx)) != -1){
            result++;
            idx++;
        }
        return result;
    }
}