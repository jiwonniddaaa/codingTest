// //자바에서 String 객체는 한번 만들어지면 수정이 안되기 때문에 n개의 반복이면 n개의 객체가 만들어짐
// class Solution{
//     public String solution(String my_string, int k){
//         String result = "";
//         for (int i = 0; i < k; i++){
//             result += my_string;
//         }
//         return result;
//     }
// }
// //sb는 하나의 바구니에 갱신하는 것처럼 함
// class Solution{
//     public String solution(String my_string, int k){
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < k; i++){
//             sb.append(my_string);
//         }
        
//         return sb.toString();
//     }
// }
//자바의 String의 repeat 함수
class Solution{
    public String solution(String my_string, int k){
        return my_string.repeat(k);
    }
}