import java.util.ArrayList;

class Solution{
    public String[] solution(String[] str_list){
        ArrayList<String> str1 = new ArrayList<>();
        ArrayList<String> str2 = new ArrayList<>();
        
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l")){
                String[] result1 = new String[str1.size()];
                for(int j = 0; j < str1.size(); j++){
                    result1[j] = str1.get(j);
                }
                return result1;
            }
            else if(str_list[i].equals("r")){
                for(int j = i + 1; j < str_list.length; j++){
                    str2.add(str_list[j]);
                }
                String[] result2 = new String[str2.size()];
                for(int j = 0; j < str2.size(); j++){
                    result2[j] = str2.get(j);
                }
                return result2;
            }
            else{
                str1.add(str_list[i]);
            }
        }
        return new String[0];
    }
}