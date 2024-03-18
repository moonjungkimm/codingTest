class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double box = 0;
        for(int i=0; i<arr.length; i++){
            box += arr[i];
        }
        answer = box/arr.length;
        return answer;
    }
}