class Solution{
    public int solution(int[] num_list){
        int result = 0;
        if(num_list.length >= 11){
                for(int j = 0; j < num_list.length; j++){
                    result += num_list[j];
                }
            }
            else if(num_list.length <= 10){
                result = 1;
                for(int j = 0; j < num_list.length; j++){
                    result *= num_list[j];
                }
            }
        return result;
        }
}