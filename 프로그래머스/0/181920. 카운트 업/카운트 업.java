class Solution{
    public int[] solution(int start_num, int end_num){
        int[] result = new int[end_num - start_num + 1];
        int j = 0;
        for(int i = start_num; i < (end_num + 1); i++){
            result[j] = i;
            j++;
        }
        return result;
    }
}