class Solution {
    public int maxSubArray(int[] nums) {
        int nextbest=nums[0];;
        int best[]=new int[nums.length];
        best[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            best[i]=Math.max(nextbest+nums[i],nums[i]);
            nextbest=best[i];
        }
        nextbest=best[0];
        for(int i=0;i<best.length;i++){
            nextbest=Math.max(best[i],nextbest);
        }
        return nextbest;
    }
}
