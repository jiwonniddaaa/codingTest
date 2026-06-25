class Solution{
    public int[] solution(int[] arr, int[][] queries){
        int n = 0;
        int m = 0;
        int a = 0;
        int b = 0;
        for(int i = 0; i < queries.length; i++){
            n = queries[i][0];
            m = queries[i][1];
            a = arr[n];
            b = arr[m];
            arr[n] = b;
            arr[m] = a;
        }
        return arr;
    }
}