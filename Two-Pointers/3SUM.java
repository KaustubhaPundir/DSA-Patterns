import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int temp=nums[0];
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int p1 = i + 1;
            int p2 = nums.length - 1;
            while (p1<p2){
                temp=nums[i]+nums[p1]+nums[p2];
                if(temp==0){
                    res.add(Arrays.asList(nums[i], nums[p1], nums[p2]));
                    p1++;
                    p2++;
                }
                else if(temp>0){
                    p2--;
                }
                else{
                    p1++;
                }
            }
        }return res;
    }
}
