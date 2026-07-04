class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace("A", "x");
        myString = myString.replace("B", "A");
        myString = myString.replace("x", "B");
        
        if(myString.contains(pat)){
            return 1;
        }
        return 0;
    }
}