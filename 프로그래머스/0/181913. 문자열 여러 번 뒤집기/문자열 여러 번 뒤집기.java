class Solution{
    public String solution(String my_string, int[][] queries){
        char[] arr = my_string.toCharArray();
        for (int i = 0; i < queries.length; i++) {
            int n = queries[i][0];
            int m = queries[i][1];
            while (n < m) {
                char temp = arr[n];
                arr[n] = arr[m];
                arr[m] = temp;
                
                n++;
                m--;
            }
        }
        return new String(arr);
    }
}