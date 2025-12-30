// class Solution { //two pass algo
//     public void sortColors(int[] nums) {
//         int red=0;
//         int white=0;
//         int blue=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==0){
//                 red++;
//             }
//             else if(nums[i]==1){
//                 white++;
//             }
//             else{
//                 blue++;
//             }
//         }
//         for(int i=0;i<nums.length;i++){
//             if(red!=0){
//                 nums[i]=0;
//                 red--;
//             }
//             else if(white!=0){
//                 nums[i]=1;
//                 white--;
//             }
//             else{
//                 nums[i]=2;
//                 blue--;
//             }
//         }
//     }
// }
class Solution { //one pass
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
