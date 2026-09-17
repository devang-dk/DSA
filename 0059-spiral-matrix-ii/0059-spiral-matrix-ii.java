class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int startrow=0;
        int endrow=n-1;
        int startcol=0;
        int endcol=n-1;
        int value=1;
        while(startrow<=endrow && startcol<=endcol && value<=n*n){
            for(int i=startcol;i<=endcol;i++){
                ans[startrow][i]=value;
                value++;
            }
            for(int i=startrow+1;i<=endrow;i++){
                ans[i][endcol]=value;
                value++;
            }
            for(int i=endcol-1;i>=startcol;i--){
                if(startrow==endrow){
                    break;
                }
                ans[endrow][i]=value;
                value++;
            }
            for(int i=endrow-1;i>startrow;i--){
                if(startcol==endcol){
                    break;
                }
                ans[i][startcol]=value;
                value++;
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
        return ans;
    }
}