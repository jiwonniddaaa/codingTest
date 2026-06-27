class Solution{
    public String solution(String[] my_strings, int[][] parts){
        String result = "";
        for(int i = 0; i < my_strings.length; i++){
            for(int j = parts[i][0]; j < (parts[i][1] + 1); j++){
                result += my_strings[i].charAt(j);
            }
        }
        return result;
    }
}