class Solution{
    public int solution(int[] arr, int idx){
        int result = -1;
        for(int i = (arr.length - 1); i >= idx; i--){
            if(arr[i] == 1){
                result = i;
            }
        }
        return result;
    }
}