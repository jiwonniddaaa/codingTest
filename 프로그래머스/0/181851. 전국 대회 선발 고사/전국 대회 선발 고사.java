import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] num = new int[rank.length + 1];
        for(int i = 0; i < rank.length; i++){
            num[rank[i]] = i;
        }
        
        ArrayList<Integer> attendRanks = new ArrayList<>();
        for(int i = 0; i < attendance.length; i++){
            if(attendance[i]){
                attendRanks.add(rank[i]);
            }
        }
        
        Collections.sort(attendRanks);
        
        int result = num[attendRanks.get(0)] * 10000 + num[attendRanks.get(1)] * 100 + num[attendRanks.get(2)];
        return result;
    }
}