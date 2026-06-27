class Solution{
    public int solution(String number){
        int sum = 0;
        for(int i = 0; i < number.length(); i++){
            char c = number.charAt(i);
            sum += Character.getNumericValue(c);
        }
        return (sum % 9);
    }
}