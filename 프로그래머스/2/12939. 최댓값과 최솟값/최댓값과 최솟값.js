function solution(s) {
    var answer = '';
    
    var arr = s.split(' ');
    
    answer = `${Math.min(...arr)} ${Math.max(...arr)}`;
    
    return answer;
}