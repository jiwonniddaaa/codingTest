class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        // 배열로 바꾸거나
        char[] codeArr = code.toCharArray();
        // 문자열에서 처리하거나 char current = code.charAt(idx);
        for (int idx = 0; idx < codeArr.length; idx++) {
            // 타입이 char이라 ''임
            if (codeArr[idx] == '1') {
                // ==는 비교연산자 =는 대입연산자
                mode = 1 - mode;
            }
            else {
                if (mode == 0) {
                    if (idx % 2 == 0) {
                        //자바의 string에는 append가 없음(StringBuilder 이런 곳에만 있음)
                        answer += codeArr[idx];
                    }
                }
                if (mode == 1) {
                    if (idx % 2 != 0) {
                        answer += codeArr[idx];
                    }
                }
            }
        }
        return answer.isEmpty()? "EMPTY" : answer;
    }
}

