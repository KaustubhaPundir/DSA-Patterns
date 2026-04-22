class Solution {
    public int mySqrt(int x) {
        int half=0;
        int low=0;
        int high=x;
        int ans=0;
        while(low<=high){
            half=low-(low-high)/2;
            if((long)half*half==x){
                return half;
            }
            else if ((long)half*half>x){
                high=half-1;
            }
            else if((long)half*half<x){
                ans=half;
                low=half+1;
            }
        }
        return ans;
    }
}
