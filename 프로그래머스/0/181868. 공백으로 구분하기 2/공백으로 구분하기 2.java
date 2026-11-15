class Solution{
    public String[] solution(String my_string){
        //strip은 앞뒤 공백 제거
        //split은 특정 문자로 나누기
        String[] result = my_string.strip().split("\\s+");
        return result;
    }
}