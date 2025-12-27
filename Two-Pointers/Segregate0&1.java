// User function Template for Java

class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int p1=0;
        int p2=arr.length-1;
        while(p1<p2){
            if(arr[p1]==1 && arr[p2]==0){
                arr[p1]=0;
                arr[p2]=1;
                p1++;
                p2--;
            }
            else if(arr[p1]==0){
                p1++;
            }
            else if(arr[p2]==1){
                p2--;
            }
        }
    }
}
