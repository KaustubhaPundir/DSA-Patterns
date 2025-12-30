class Solution {
    long countTriplets(int n, int sum, long arr[]) {
        long count=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            int p1=i+1;
            int p2=arr.length-1;
            while(p1<p2){
                long temp=arr[i]+arr[p1]+arr[p2];
                if(temp<sum){
                    count+=(p2-p1);
                    p1++;
                }
                else{
                    p2--;
                }
            }
        }
        return count;
    }
}
