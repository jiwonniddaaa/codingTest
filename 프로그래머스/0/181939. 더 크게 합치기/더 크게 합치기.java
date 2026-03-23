class Solution{
    public int solution(int a, int b){
        // int나 char은 모두 자바의 기본형이므로 변수 뒤에 바로 .toString()을 붙일 수 없음(Integer.toString(n), String.valueOf(n))
        // Integer.parseInt(n)
        String str1 = String.valueOf(a) + String.valueOf(b);
        String str2 = String.valueOf(b) + String.valueOf(a);
        int p = Integer.parseInt(str1);
        int q = Integer.parseInt(str2);
        // if (p < q){
        //     return q;
        // }
        // else {
        //     return p;
        // }
        return Math.max(p, q);
    }
}