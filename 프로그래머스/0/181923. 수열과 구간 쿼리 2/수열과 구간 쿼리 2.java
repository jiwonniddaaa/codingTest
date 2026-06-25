class Solution{
    public int[] solution(int[] arr, int[][] queries){
        int n = 0;
        int m = 0;
        int[] result = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            n = queries[i][0];
            m = queries[i][1];
            int min = 1000000;
            for(int j = n; j < (m + 1); j++){
                if(arr[j] > queries[i][2]){
                    if(arr[j] < min){
                        min = arr[j];
                    }
                }
            }
            if(min == 1000000){
                min = -1;
            }
            result[i] = min;
        }
        return result;
    }
}