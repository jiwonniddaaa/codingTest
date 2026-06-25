class Solution{
    public int solution(int a, int b, int c, int d){
        int[] arr = {a, b, c, d};
        int[] count = new int[6];
        int result = 0;
        for(int i = 0; i < arr.length; i++){
            int n = arr[i];
            count[n - 1]++;
        }
        
        int n1 = 0, n11 = 0, n2 = 0, n22 = 0, n3 = 0;
        int twoCount = 0;
        for(int j = 0; j < 6; j++){
            if(count[j] == 4){
                result = 1111 * (j + 1);
            }
            else if(count[j] == 3){
                n3 = j + 1;
            }
            else if(count[j] == 2){
                twoCount++;
                if(n2 != 0){
                    n22 = j + 1;
                } else n2 = j + 1;
            }
            else if(count[j] == 1){
                if(n1 != 0){
                    n11 = j + 1;
                } else n1 = j + 1;
            }
        }
        
        if(n3 != 0){
            result = (10 * n3 + n1) * (10 * n3 + n1);
        }
        else if((n2 != 0) && (twoCount == 2)){
            result = (n2 + n22) * Math.abs(n2 - n22);
        } 
        else if(twoCount == 1){
            result = n1 * n11;
        }
        else if(result == 0){
            result = Math.min(Math.min(a, b), Math.min(c, d));
        }
        return result;
    }
}