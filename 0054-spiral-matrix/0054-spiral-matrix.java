class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startrow=0;
        int endrow=matrix.length-1;
        int startcolumn=0;
        int endcolumn=matrix[0].length-1;
        List<Integer> ans  = new ArrayList<>();
        while(startrow<=endrow && startcolumn<=endcolumn){
            for(int i=startcolumn;i<=endcolumn;i++){
                ans.add(matrix[startrow][i]);
            }
            for(int i=startrow+1;i<=endrow;i++){
                ans.add(matrix[i][endcolumn]);
            }
            for(int i=endcolumn-1;i>=startcolumn;i--){
                if(startrow==endrow){
                    break;
                }
                ans.add(matrix[endrow][i]);
            }
            for(int i=endrow-1;i>startrow;i--){
                if(startcolumn==endcolumn){
                    break;
                }
                ans.add(matrix[i][startcolumn]);
            }
            startrow++;
            endrow--;
            startcolumn++;
            endcolumn--;
        }
        return ans;
    }
}