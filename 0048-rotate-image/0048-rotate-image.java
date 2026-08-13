class Solution {
    public void rotate(int[][] matrix) {
        int[][] temp = new int[1][1];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(j>i){
                    temp[0][0] = matrix[i][j];
                    matrix[i][j]= matrix[j][i];
                    matrix[j][i] = temp[0][0];
                }
            }
        }
        int lastindex=matrix[0].length-1;
        int j=0;
        for(int i=0;i<matrix.length;i++){
            lastindex=matrix[0].length-1;
            j=0;
            while(j<lastindex){
                temp[0][0] = matrix[i][j];
                matrix[i][j]= matrix[i][lastindex];
                matrix[i][lastindex] = temp[0][0];
                lastindex--;
                j++;
            }
        }
    }
}