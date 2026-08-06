class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            int mul = 1;
            int temp = n;

            while (temp > 0) {
                int r = temp % 10;
                mul*= r;
                temp /= 10;
            }

            if (mul % t == 0) {
                return n;
            }

            n++;
        }
    }
}