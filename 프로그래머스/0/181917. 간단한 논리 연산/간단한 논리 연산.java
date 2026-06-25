class Solution{
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4){
        boolean bool1 = x1 || x2;
        boolean bool2 = x3 || x4;
        boolean result = bool1 && bool2;
        return result;
    }
}