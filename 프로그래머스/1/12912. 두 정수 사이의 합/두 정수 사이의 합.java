class Solution {
    public long solution(int a, int b) {
        long answer = 0;
       
            if(a<b){
                for(int i=a; i<=b; i++){
                    answer += i;
                    if(i==b){
                        break;
                    }
                }
            }else if(b<a){
                for(int i=b; i<=a; i++){
                    answer += i;
                    if(i==a){
                        break;
                    }
                }
            }else{
                answer = a;
            }
        
        return answer;
    }
}