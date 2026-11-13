import java.util.*;
class Solution {
    public int solution(String s) {
        Map<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        String num = "";
        String answerStr = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= '0' && c <= '9'){
                answerStr += c;
            } else{
                num += c;
                if(map.containsKey(num)){
                    answerStr += map.get(num);
                    num = "";
                }
            }
            
        }
        
        int answer = Integer.parseInt(answerStr);
        return answer;
    }
}

//replace는 문자열 안에 들어있는 특정 문자열을 다른 문자열로 바꿔줄 수 있음