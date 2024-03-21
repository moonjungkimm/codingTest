class Solution {
    public long solution(long n) {
        double answer = 0;

        double ans = Math.sqrt(n);
        
        System.out.println(ans);
        System.out.println((int)ans);
        System.out.println(Math.ceil(ans));
        
        if((int)ans == Math.ceil(ans)){
            answer = (ans+1)*(ans+1);
        }else{
            answer = -1;
        }
        
        return (long)answer;
    }
}