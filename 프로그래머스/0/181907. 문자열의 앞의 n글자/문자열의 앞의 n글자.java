class Solution{
    public String solution(String my_string, int n){
        String result = "";
        for(int i = 0; i < n; i++){
            result += my_string.charAt(i);
        }
        return result;
    }
}