class Solution{
    public String[] solution(String my_string){
        String[] result = my_string.strip().split("\\s+");
        return result;
    }
}