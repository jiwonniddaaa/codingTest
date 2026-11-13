class Solution {
    public int solution(String[] babbling) {
        //trim, strip은 맨앞,뒤 공백 지워주기
        int answer = 0;
        for(int i = 0; i < babbling.length; i++){
            if(babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || babbling[i].contains("woowoo") || babbling[i].contains("mama")){}else{
                babbling[i] = babbling[i].replace("aya", " ");
            babbling[i] = babbling[i].replace("ye", " ");
            babbling[i] = babbling[i].replace("woo", " ");
            babbling[i] = babbling[i].replace("ma", " ");
        }
            }
        for(int i = 0; i < babbling.length; i++){
            if(babbling[i].trim().isEmpty()){
                answer++;
            }
        }
        return answer;
    }
}