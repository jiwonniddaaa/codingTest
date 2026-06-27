import java.util.ArrayList;

class Solution{
    public int[] solution(String[] intStrs, int k, int s, int l){
        ArrayList<Integer> ret = new ArrayList<>();
        for(int i = 0; i < intStrs.length; i++){
            String str = "";
            for(int j = s; j < (s + l); j++){
                str += intStrs[i].charAt(j);
            }
            if(Integer.parseInt(str) > k ){
                ret.add(Integer.parseInt(str));
            }
        }
        int[] result = new int[ret.size()];
        for (int i = 0; i < ret.size(); i++) {
            result[i] = ret.get(i);
        }
        return result;
    }
}