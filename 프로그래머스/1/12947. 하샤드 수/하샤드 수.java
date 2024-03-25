class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int targer = x;
        int box = 0;
        int cnt = (int)Math.log10(x) + 1;

        for(int i=0; i<cnt; i++){
            box += targer%10;
            targer /= 10;
        }
    
        if(x%box != 0){
            answer =false;
        }
        
        return answer;
    }
}