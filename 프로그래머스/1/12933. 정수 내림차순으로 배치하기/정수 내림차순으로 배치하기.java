import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;    
        String str = Long.toString(n);
        int [] arr = new int[str.length()];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = str.charAt(i) - '0';
        }
        
        Arrays.sort(arr);
        
        for(int i = arr.length-1; i>=0; i--){
            answer = answer * 10 + arr[i];
        }
        
        return answer;
    }
}