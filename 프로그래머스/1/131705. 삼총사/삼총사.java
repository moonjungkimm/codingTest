class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        int [] arr = new int[3];
        
        
        for(int i=0; i<number.length-2; i++){
            arr[0] = number[i];
            
            for(int k=i+1; k<number.length-1; k++){
                arr[1] = number[k];
                
                for(int j=k+1; j<number.length; j++){
                    arr[2] = number[j];
                    if(arr[0] + arr[1] + arr[2] == 0){
                        answer += 1;
                    }
                }    //end for
                
            }   //end for
            
        }   //end for
        
        return answer;
    }
}