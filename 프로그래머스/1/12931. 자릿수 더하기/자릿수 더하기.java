import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String ans = Integer.toString(n);
        for(char c : ans.toCharArray()){
            answer += c-'0';
        }
        
        return answer;
    }
}