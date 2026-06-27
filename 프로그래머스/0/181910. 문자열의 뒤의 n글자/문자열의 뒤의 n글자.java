class Solution{
    public String solution(String my_string, int n){
        String result = "";
        for(int i = (my_string.length() - n); i < my_string.length(); i++){
            result += my_string.charAt(i);
        }
        return result;
    }
}