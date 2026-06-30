class Solution{
    public int[] solution(int[] arr, int[][] intervals){
        int list1 = intervals[0][1] - intervals[0][0] + 1;
        int list2 = intervals[1][1] - intervals[1][0] + 1;
        int[] result = new int[list1 + list2];
        for(int i = intervals[0][0]; i < (intervals[0][1] + 1); i++){
            result[i - intervals[0][0]] = arr[i];
        }
        for(int j = intervals[1][0]; j < (intervals[1][1] + 1); j++){
            result[j - intervals[1][0] + list1] = arr[j];
        }
        return result;
    }
}