class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int min=nums[0];
        int max=nums[n-1];
        int j=0;
        for(int i=min;i<max;i++){
            if(j<n && nums[j]==i){
                while(j<n && nums[j]==i){
                    j++;
                }
            }
            else{
                ans.add(i);
            }
        }
        return ans;
    }
}