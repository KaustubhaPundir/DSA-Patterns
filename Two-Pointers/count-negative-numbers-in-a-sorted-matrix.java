class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int len=grid.length-1; //3
        int intlen=grid[0].length-1; //3
        int t1=len;
        int t2=intlen;
        for(int i=(len+1)*(intlen+1)-1;i>=0;i--){
            if (t1<0){
                break;
            }
            if (t2<0){
                t1--;
                t2=intlen;
            }
            if(grid[t1][t2]<0){
                count++;
            }
            t2--;
        }
        return count;
    }
}
