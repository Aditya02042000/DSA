class Solution {
public:
    int climbStairs(int n) {
        int step1=1;
        int step2=1;

        for(int i=1;i<n;i++){
            int curr=step1+step2;
            step1=step2;
            step2=curr;
        }
        return step2;
    }
};