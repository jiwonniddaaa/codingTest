// public class Main{
//     public static void main(String[] args){
//         // 객체 생성
//         Solution sol = new Solution();
        
//         직접 삽입하거나 Scanner 사용
//         String result = sol.solution(my_string, overwrite_string, s);
        
//         System.out.println(result);
//     }
// }

// //클래스는 단순 상자이고 내부 메서드로 변수 받음
// class Solution{
//     public String solution(String my_string, String overwrite_string, int s){
//         String before = my_string.substring(0, s);
//         //끝이 마지막이면 안써도됨
//         String after = my_string.substring(s + overwrite_string.length());
        
//         return before + overwrite_string + after;
//     }
// }

//StringBuilder 사용(문자열 조작 가능), .append/.replace/.reverse/.insert/.delete, import 필요 없음

class Solution{
    public String solution(String my_string, String overwrite_string, int s){
        StringBuilder sb = new StringBuilder(my_string);
        //sb.replace는 StringBuilder 객체를 돌려줌, String이 아님
        sb.replace(s, s + overwrite_string.length(), overwrite_string);
        return sb.toString();
    }
}