class Solution {
    public int solution(int num) {
        int answer = 0;
        int n = num;
        while(n != 1) {
            answer++;
            if(n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            if(answer >= 400) {
                return -1;
            }
        }
        return answer;
    }
}