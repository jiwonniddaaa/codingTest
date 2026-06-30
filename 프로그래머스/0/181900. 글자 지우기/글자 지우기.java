import java.util.ArrayList;

class Solution{
    public String solution(String my_string, int[] indices){
        String[] arr = new String[my_string.length()];
        for(int i = 0; i < my_string.length(); i++){
            arr[i] = my_string.charAt(i) + "";
        }
        for(int j = 0; j < indices.length; j++){
            arr[indices[j]] = "0";
        }
        
        String result = "";
        for(int k = 0; k < arr.length; k++){
            if(arr[k] != "0"){
                result += arr[k];
            }
        }
        
        return result;
    }
}