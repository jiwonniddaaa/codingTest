class Solution{
    public int[] solution(int[] arr, int[][] queries){
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            result[i] = arr[i];
        }
        
        for(int i = 0; i < queries.length; i++){
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                result[j] += 1;
            }
        }
        
        return result;
    }
}