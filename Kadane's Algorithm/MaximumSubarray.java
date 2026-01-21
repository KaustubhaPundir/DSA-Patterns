class Solution {
    public int maxSubArray(int[] nums) {
        int best=nums[0];;
        int nextbest;
        for(int i=0;i<nums.length;i++){
            best=Math.max(best+nums[i],nums[i]);
        }
        return best;
    }
}
