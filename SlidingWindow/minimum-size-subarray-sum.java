class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int p1=0;
        int p2=1;
        int p1res=0;
        int p2res=nums.length;
        int sum=nums[p1];
        while(p2<nums.length){
            if(sum<target ){
                sum=sum+nums[p2];
                p2++;
            }
            else if(sum>=target){
                if(p2-p1<p2res-p1res){
                    p2res=p2;
                    p1res=p1;
                }
                sum=sum-nums[p1];
                p1++;
            } 
        }
        if(sum<target){
            return 0;
        }
        return p2res-p1res;
    }
}
