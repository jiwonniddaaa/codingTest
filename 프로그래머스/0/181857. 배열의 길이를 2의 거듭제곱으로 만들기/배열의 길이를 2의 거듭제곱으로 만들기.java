class Solution {
    public int[] solution(int[] arr) {
        int num = 1;
        while(num < arr.length){
            num *= 2;
        }
        
        int[] result = new int[num];
        for(int i = 0; i < arr.length; i++){
            result[i] = arr[i];
        }
        for(int i = arr.length; i < num; i++){
            result[i] = 0;
        }
        return result;
    }
}