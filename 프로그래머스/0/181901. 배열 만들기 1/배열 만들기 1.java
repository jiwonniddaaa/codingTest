import java.util.ArrayList;

class Solution{
    public int[] solution(int n, int k){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i % k == 0){
                arr.add(i);
            }
        }
        int[] result = new int[arr.size()];
        for(int j = 0; j < arr.size(); j++){
            result[j] = arr.get(j);
        }
        return result;
    }
}