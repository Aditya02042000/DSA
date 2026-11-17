class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(n == 0) {
            return 1;
        }
        if(n < 0) {
            return 1.0 / power(x, -N);
        }
        if(n % 2 == 0) {
            return power(x * x, N / 2);
        }
        return x * power(x * x, (N - 1) / 2);
    }

    double power(double x, long n) {
        return Math.pow(x, n);
    }
}