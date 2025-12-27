import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        int p1=0;
        int p2=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[p1]>=nums[p2]){
                result[i]=nums[p1];
                p1++;
            }
            else if(nums[p1]<nums[p2]){
                result[i]=nums[p2];
                p2--;
            }
        }
        return result;
    }
}
