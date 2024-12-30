function solution(a, b) {
    var answer = 1234567890;
   
    answer = a.reduce((acc, cur, idx) => {
        return acc + cur * b[idx];
        console.log(`acc : ${acc}, cur : ${cur}, idx : ${idx}`)
        console.log(`b[idx] : ${b[idx]}`)
    },0);
    
    
    
    return answer;
}