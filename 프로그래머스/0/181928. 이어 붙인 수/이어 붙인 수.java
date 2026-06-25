class Solution{
    public int solution(int[] num_list){
        String str1 = "";
        String str2 = "";
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                str2 += Integer.toString(num_list[i]).charAt(0);
            }
            else{
                str1 += Integer.toString(num_list[i]).charAt(0);
            }
        }
        return (Integer.parseInt(str1) + Integer.parseInt(str2));
    }
}