import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        String[] arr = myStr.split("[abc]+");
        ArrayList<String> list = new ArrayList<>();
        for (String str : arr) {
            if (!str.isEmpty()) {
                list.add(str);
            }
        }
        if (list.isEmpty()) {
            list.add("EMPTY");
        }
        return list.toArray(new String[0]);
    }
}