class Solution {
    static int smallestSumSubarray(int a[], int size) {
        // your code here
        int nextbest=a[0];;
        int best[]=new int[a.length];
        best[0]=a[0];
        for(int i=1;i<a.length;i++){
            best[i]=Math.min(nextbest+a[i],a[i]);
            nextbest=best[i];
        }
        nextbest=best[0];
        for(int i=0;i<best.length;i++){
            nextbest=Math.min(best[i],nextbest);
        }
        return nextbest;
        
    }
}
