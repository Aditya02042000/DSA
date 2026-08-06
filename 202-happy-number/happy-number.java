class Solution {
    public boolean isHappy(int n) {
        while(true){
        int sum=0;
        int t=n;
        while(t>0){
            int r=t%10;
            sum+=(r*r);
            t=t/10; 
        }
        if(sum==1){
            return true;
        }
        if(sum==4){
            return false;
        }
        n=sum;
        }
    }
}