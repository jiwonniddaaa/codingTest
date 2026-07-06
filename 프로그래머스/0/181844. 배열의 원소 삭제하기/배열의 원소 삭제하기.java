import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < delete_list.length; j++){
                if(arr[i] == delete_list[j]){
                    arr[i] = 0;
                }
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                list.add(arr[i]);
            }
        }
        
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        
        return result;
    }
}