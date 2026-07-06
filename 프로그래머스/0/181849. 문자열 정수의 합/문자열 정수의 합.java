class Solution {
    public int solution(String num_str) {
        String[] strArr = num_str.split("");
        int arr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
    arr[i] = Integer.parseInt(strArr[i]);
        }
        int result = 0;
        for(int i = 0; i < arr.length; i++){
            result += arr[i];
        }   
        return result;
    }
}