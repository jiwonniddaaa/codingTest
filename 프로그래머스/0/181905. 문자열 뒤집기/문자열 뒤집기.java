class Solution{
    public String solution(String my_string, int s, int e){
        String result = "";
        for(int i = 0; i < s; i++){
            result += my_string.charAt(i);
        }
        for(int j = e; j > (s - 1); j--){
            result += my_string.charAt(j);
        }
        for(int k = (e + 1); k < my_string.length(); k++){
            result += my_string.charAt(k);
        }
        return result;
    }
}