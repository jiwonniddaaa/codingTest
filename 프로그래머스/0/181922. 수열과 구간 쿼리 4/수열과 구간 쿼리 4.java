class Solution{
    public int[] solution(int[] arr, int[][] queries){
        int n = 0;
        int m = 0;
        for(int idx = 0; idx < queries.length; idx++){
            n = queries[idx][0];
            m = queries[idx][1];
            for(int i = n; i < (m + 1); i++){
             if(i % queries[idx][2] == 0){
                 arr[i] += 1;
             }   
            }
        }
        return arr;
    }
}