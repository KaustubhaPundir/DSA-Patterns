class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int p1=1;
        int p2=numbers.length;
        while(p1<p2){
            if(numbers[p1-1]+numbers[p2-1]==target){
                return new int[]{p1,p2};
            }
            else if (numbers[p1-1]+numbers[p2-1]<target){
                p1++;
            }
            else{
                p2--;
            }
        }
        return new int[]{};
    }
}
