import java.util.ArrayList;

class Solution{
    public int[] solution(int[] arr){
        int i = 0;
        ArrayList<Integer> stk = new ArrayList<>();
        while(i < arr.length){
            if(stk.isEmpty()){
                stk.add(arr[i]);
                i += 1;
            }
            else if(!stk.isEmpty() && stk.get(stk.size() - 1) < arr[i]){
                stk.add(arr[i]);
                i += 1;
            }
            else if(!stk.isEmpty() && stk.get(stk.size() - 1) >= arr[i]){
                stk.remove(stk.size() - 1);
            }
        }
        int[] result = new int[stk.size()];
        for(int j = 0; j < stk.size(); j++){
            result[j] = stk.get(j);
        }
        return result;
    }
}