class Solution {
    public int[][] solution(int n) {
        int[][] result = new int[n][n];
        
        int r = 0;
        int c = -1;
        int moveLength = n;
        int num = 1;
        
        while (moveLength > 0) {
            for (int i = 0; i < moveLength; i++) {
                c++;
                result[r][c] = num++;
            }
            moveLength--;
            for (int i = 0; i < moveLength; i++) {
                r++;
                result[r][c] = num++;
            }
            for (int i = 0; i < moveLength; i++) {
                c--;
                result[r][c] = num++;
            }
            moveLength--;
            for (int i = 0; i < moveLength; i++) {
                r--;
                result[r][c] = num++;
            }
        }
        return result;
    }
}