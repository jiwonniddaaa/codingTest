import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] result = new int[k];
        Arrays.fill(result, -1);
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            if(idx == k) break;
            boolean hasValue = false;
            for (int j = 0; j < idx; j++) {
                if (result[j] == arr[i]) {
                    hasValue = true;
                    break;
                }
            }
            if(!hasValue){
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }
}