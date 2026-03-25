class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        //String 비교는 .equals() 사용
        //if나 else if에 안들어갈 수도 있으므로 return 기본값 지정
        if (ineq.equals(">")) {
            if (eq.equals("=")){
                return (n >= m) ? 1 : 0;
            }
            else if(eq.equals("!")) {
                return (n > m) ? 1 : 0;
            }
        }
        else if (ineq.equals("<")) {
            if (eq.equals("=")){
                return (n <= m) ? 1 : 0;
            }
            else if(eq.equals("!")) {
                return (n < m) ? 1 : 0;
            }
        }
        return 0;
    }
}