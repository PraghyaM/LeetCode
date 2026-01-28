class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1.0;
        if (n == Integer.MIN_VALUE) {
            return 1 / (myPow(x, Integer.MAX_VALUE) * x);
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        if (n % 2 == 0) {
            return myPow(x * x, n / 2);
        } else {
            return x * myPow(x, n - 1);
        }
    }
}
