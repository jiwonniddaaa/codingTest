class Solution{
    public int solution(String myString, String pat){
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        if(myString.length() < pat.length()){
            return 0;
        }
        else{
            if(myString.contains(pat)){
                return 1;
            }
        }
        return 0;
    }
}