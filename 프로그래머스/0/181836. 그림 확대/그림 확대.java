import java.util.ArrayList;

class Solution {
    public String[] solution(String[] picture, int k) {
        ArrayList<String> list = new ArrayList<>(); 
        for(String str : picture){
            str = str.replace("x", "X".repeat(k));
            str = str.replace(".", ".".repeat(k));
            str = str.replace("X", "x");
            for(int i = 0; i < k; i++){
                list.add(str);
            }
        }
        String[] result = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}