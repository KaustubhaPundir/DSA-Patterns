class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res=999999;
        int high=0;
        int low=0;
        int sum=0;
        while(high<nums.length){
            sum=sum+nums[high];
            while(sum>=target){
                res=Math.min(high-low+1,res);
                sum=sum-nums[low];
                low++;
            }
            high++;
        }
        if(res==999999){
            return 0;
        }
        return res;

    }
}
