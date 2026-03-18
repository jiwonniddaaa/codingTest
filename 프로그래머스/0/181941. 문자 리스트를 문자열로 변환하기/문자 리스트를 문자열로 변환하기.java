class Solution{
    //String str은 단순 문자열 하나이지만, String[] arr은 문자열 배열을 받는다는 뜻
    public String solution(String[] arr){
        //배열의 길이는 고정이라 괄호가 없음, 리스트/문자열은 괄호 있음
        int a = arr.length;
        String result = "";
        for (int i = 0; i < a; i++){
            result += arr[i];
        }
        return result;
    }
}