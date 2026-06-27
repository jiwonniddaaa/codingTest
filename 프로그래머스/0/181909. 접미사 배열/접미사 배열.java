import java.util.ArrayList;
import java.util.Collections;

class Solution{
    public String[] solution(String my_string){
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++){
            String str = "";
            for(int j = i; j < my_string.length(); j++){
                str += my_string.charAt(j);
            }
            result.add(str);
        }
        Collections.sort(result);
        String[] answer = new String[result.size()];
        for(int k = 0; k < result.size(); k++){
            answer[k] = result.get(k);
        }
        return answer;
    }
}