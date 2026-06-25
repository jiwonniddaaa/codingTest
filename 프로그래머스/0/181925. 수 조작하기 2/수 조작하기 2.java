class Solution{
    public String solution(int[] numLog){
        String result = "";
        for(int i = 0; i < (numLog.length - 1); i++){
            int n = numLog[i + 1] - numLog[i];
            if(n == 1){
                result += "w";
            }
            else if(n == -1){
                result += "s";
            }
            else if(n == 10){
                result += "d";
            }
            else if(n == -10){
                result += "a";
            }
        }
        return result;
    }
}