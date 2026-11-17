import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> answerMap = new HashMap<>();
        Set<String> set = new HashSet<>();
        for(String p : id_list){
            answerMap.put(p, 0);
        }
        
        for(String p : report){
            set.add(p);
        }
        
        for(String p : set){
            String[] a = p.split(" ");
            map.put(a[1], map.getOrDefault(a[1], 0) + 1);
        }
        
        for (String p : set) {
            String[] a = p.split(" ");
            if (map.get(a[1]) >= k) {
                answerMap.put(a[0], answerMap.getOrDefault(a[0], 0) + 1);
            }
        }
        
        for(int i = 0; i < id_list.length; i++){
            answer[i] = answerMap.get(id_list[i]);
        }
        return answer;
    }
}