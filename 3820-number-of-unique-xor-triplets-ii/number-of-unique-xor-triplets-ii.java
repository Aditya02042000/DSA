class Solution {
    public int uniqueXorTriplets(int[] nums) {
       HashSet<Integer>pair=new HashSet<>();
       for(int i=0;i<nums.length;i++){
        for(int j=i;j<nums.length;j++){
            pair.add(nums[i]^nums[j]);
        }
       }
       HashSet<Integer>ans=new HashSet<>();
       for(int x:pair){
            for(int num : nums){
                ans.add(x^num);
            }
       }
       return ans.size();
    }
}