import java.util.ArrayList;

class Solution{
    public int[] solution(int[] arr){
        ArrayList<Integer> idx = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                idx.add(i);
            }
        }
        if(idx.size() == 0){
            return new int[]{-1};
        }
        else{
            for(int i = idx.get(0); i <= idx.get(idx.size() - 1); i++){
                answer.add(arr[i]);
            }
        }
        
        int[] result = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++){
            result[i] = answer.get(i);
        }
        return result;
    }
}