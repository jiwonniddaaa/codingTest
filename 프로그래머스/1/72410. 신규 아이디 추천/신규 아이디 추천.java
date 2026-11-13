class Solution {
    public String solution(String new_id) {
        String answer = "";
        // 1단계
        new_id = new_id.toLowerCase();
        
        // 2단계
        for (int i = 0; i < new_id.length(); i++) {
            char c = new_id.charAt(i);
            if (('a' <= c && 'z' >= c) || c == '-' || c == '_' || c == '.' || ('0' <= c && '9' >= c)) {
                answer += c;
            }
        }
        
        // 3단계
        while (answer.contains("..")) {
            answer = answer.replace("..", ".");
        }
        
        // 4단계: 반드시 5단계(빈 문자열 체크)보다 먼저 실행!
        if (answer.startsWith(".")) {
            answer = answer.substring(1);
        }
        if (answer.endsWith(".")) {
            answer = answer.substring(0, answer.length() - 1);
        }
        
        // 5단계
        if (answer.isEmpty()) {
            answer = "a";
        }
        
        // 6단계: 15글자만 남기고(0, 15), 끝이 마침표면 제거
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            if (answer.endsWith(".")) {
                answer = answer.substring(0, answer.length() - 1);
            }
        }
        
        // 7단계
        while (answer.length() <= 2) {
            answer += answer.charAt(answer.length() - 1);
        }
        
        return answer;
    }
}