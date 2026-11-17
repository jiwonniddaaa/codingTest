import java.util.*;

class Solution {
    boolean solution(String s) {
        ArrayList<Integer> openlist = new ArrayList<>();
        ArrayList<Integer> closelist = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                openlist.add(i);
            } else {
                closelist.add(i);
            }
        }

        if (openlist.size() != closelist.size()) {
            return false;
        }

        for (int i = 0; i < openlist.size(); i++) {
            if (openlist.get(i) > closelist.get(i)) {
                return false;
            }
        }

        return true;
    }
}