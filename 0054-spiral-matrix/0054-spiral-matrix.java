class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length; int n = matrix[0].length;
        int srow= 0;
        int scol = 0;
        int erow = m-1;
        int ecol = n-1;
        ArrayList<Integer> result = new ArrayList<>();

        while(srow<=erow && scol<=ecol){
            for(int i = scol; i<=ecol;i++){
                result.add(matrix[srow][i]);
            }
            for(int i = srow+1; i<=erow;i++){
                result.add(matrix[i][ecol]);
            }
            for(int i = ecol-1; i>=scol;i--){
                if(srow==erow){
                    break;
                }
                result.add(matrix[erow][i]);
            }
            for(int i = erow-1; i>=srow+1;i--){
                if(scol==ecol){
                    break;
                }
                result.add(matrix[i][scol]);
            }
            srow++;
            erow--;
            scol++;
            ecol--;
        }
        return result;
    }
}