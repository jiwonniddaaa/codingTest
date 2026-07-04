class Solution {
    public int solution(String binomial) {
        String[] list = binomial.split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[2]);
        int result = 0;
        String op = list[1];
        if(op.equals("+")){
            result = a + b;
        }
        else if(op.equals("-")){
            result = a - b;
        }
        else if(op.equals("*")){
            result = a * b;
        }
        
        return result;
    }
}