import java.util.ArrayList;

class Solution{
    public int[] solution(int n, int[] slicer, int[] num_list){
        ArrayList<Integer> list = new ArrayList<>();
        if(n == 1){
            for(int i = 0; i <= slicer[1]; i++){
                list.add(num_list[i]);
            }
        }
        else if(n == 2){
            for(int i = slicer[0]; i < num_list.length; i++){
                list.add(num_list[i]);
            }
        }
        else if(n == 3){
            for(int i = slicer[0]; i <= slicer[1]; i++){
                list.add(num_list[i]);
            }
        }
        else if(n == 4){
            for(int i = slicer[0]; i <= slicer[1]; i += slicer[2]){
                list.add(num_list[i]);
            }
        }
        
        int[] result = new int[list.size()];
        for(int j = 0; j < list.size(); j++){
            result[j] = list.get(j);
        }
        
        return result;
    }
}