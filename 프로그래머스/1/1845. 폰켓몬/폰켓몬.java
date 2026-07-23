import java.util.HashMap;

class Solution{
    public int solution(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, 1);
        }
        
        int max = nums.length / 2;
        return Math.min(max, map.size());
    }
}