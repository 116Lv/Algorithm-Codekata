class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        if (sqrt == (long) sqrt) {
            long x = (long) sqrt;
            return (long) Math.pow(x + 1, 2);
        } else {
            return -1;
        }
    }
}