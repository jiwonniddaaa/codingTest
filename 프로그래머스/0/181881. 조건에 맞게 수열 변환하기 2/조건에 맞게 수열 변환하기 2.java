import java.util.ArrayList;

class Solution{
    public int solution(int[] arr){
        ArrayList<Integer> arr_prev = new ArrayList<>();
        ArrayList<Integer> arr_next = new ArrayList<>();
        int num = 0;
        for(int i = 0; i < arr.length; i++){
            arr_prev.add(arr[i]);
        }
        
        while(true){
            arr_next = new ArrayList<>(arr_prev);
            for(int i = 0; i < arr.length; i++){
                if(arr_prev.get(i) >= 50 && arr_prev.get(i) % 2 == 0){
                    arr_next.set(i, arr_prev.get(i) / 2);
                }
                if(arr_prev.get(i) < 50 && arr_prev.get(i) % 2 != 0){
                    arr_next.set(i, arr_prev.get(i) * 2 + 1);
                }
            }
            
            if(arr_prev.equals(arr_next)){
                    return num;
            }
            arr_prev = arr_next;
            num++;
        }
    }
}