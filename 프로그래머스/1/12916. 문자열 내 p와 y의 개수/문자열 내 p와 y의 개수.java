class Solution {
    boolean solution(String s) {
        boolean answer = false;
        String[] arr = s.split("");
        int cnty = 0, cntp = 0;
        
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("p") || arr[i].equals("P")){
                cntp++;
            }else if(arr[i].equals("y") || arr[i].equals("Y")){
                cnty++;
            }
        }
        
        if(cntp == cnty){
            answer = true;
        }
        
        return answer;
    }
}