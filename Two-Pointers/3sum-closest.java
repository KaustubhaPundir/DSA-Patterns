class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int temp=nums[0];
        int diff=999999;
        int diffhold=diff;
        int p1=0;
        int p2=0;
        int ihold=0;
        int p1hold=0;
        int p2hold=0;
        for(int i=0;i<nums.length-2;i++){
            p1 = i + 1;
            p2 = nums.length-1;
            while(p1<p2){
            temp=nums[i]+nums[p1]+nums[p2];
            diff=Math.min(diff, Math.abs(target-temp));
            if (diff<diffhold){
                ihold=i;
                p1hold=p1;
                p2hold=p2;
                diffhold=diff;
            }
            if(temp<=target){
                p1++;
            }
            else if(temp>target){
                p2--;
            }
            }
        }
        return nums[ihold]+nums[p1hold]+nums[p2hold];
    }
}
