class Solution {
    public int solution(String[] strArr) {
        int[] count = new int[31];
        for(int i = 0; i < strArr.length; i++){
            int len = strArr[i].length();
            count[len]++;
        }
        int result = 0;
        for(int i = 0; i < count.length; i++){
            if(result < count[i]){
                result = count[i];
            }
        }
        return result;
    }
}