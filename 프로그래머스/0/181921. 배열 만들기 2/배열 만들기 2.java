import java.util.ArrayList;

class Solution{
    public int[] solution(int l, int r){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = l; i < r + 1; i++){
            String str = Integer.toString(i);
            boolean bool = true;
            for(int j = 0; j < str.length(); j++){
                if((str.charAt(j) == '0') || str.charAt(j) == '5'){
                } else {
                    bool = false;
                    break;
                }
            }
            if(bool){
                result.add(i);
            }
        }
        if (result.isEmpty()) {
            return new int[]{-1};
        }
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}