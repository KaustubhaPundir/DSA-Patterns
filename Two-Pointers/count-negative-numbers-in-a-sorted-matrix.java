// class Solution { m*n
//     public int countNegatives(int[][] grid) {
//         int count=0;
//         int len=grid.length-1; //3
//         int intlen=grid[0].length-1; //3
//         int t1=len;
//         int t2=intlen;
//         for(int i=(len+1)*(intlen+1)-1;i>=0;i--){
//             if (t1<0){
//                 break;
//             }
//             if (t2<0){
//                 t1--;
//                 t2=intlen;
//             }
//             if(grid[t1][t2]<0){
//                 count++;
//             }
//             t2--;
//         }
//         return count;
//     }
// }
class Solution { //m+n
    public int countNegatives(int[][] grid) {
        int count=0;
        int row=0;
        int glen=grid[0].length;
        for(int i=grid.length-1;i>=0;i--){
            for(int j=row;j<grid[0].length;j++){
                if(grid[i][j]<0){
                    count=count+(glen-j);
                    break;
                }
                if(j>=0){
                    row++;
                }
            }

        }
        return count;
    }
}
