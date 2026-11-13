class Solution {
    boolean solution(String s) {     
        s = s.toLowerCase();
        boolean answer = true;
        int pint = 0;
        int yint = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p'){
                pint++;
            }
            if(s.charAt(i) == 'y'){
                yint++;
            }
        }
        if(pint != yint){
            answer = false;
        }

        return answer;
    }
}