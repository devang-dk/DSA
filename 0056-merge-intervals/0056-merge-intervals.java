class Solution {
    public int[][] merge(int[][] intervals) {
        int[][] ans= new int[intervals.length][intervals[0].length];
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int k = 1;
        ans[0][0] = intervals[0][0];
        ans[0][1] = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(ans[k-1][1]>=intervals[i][0]){
                ans[k-1][1]=Math.max(ans[k-1][1], intervals[i][1]);
            }else{
                ans[k][0]=intervals[i][0];
                ans[k][1]=intervals[i][1];
                k++;
            }
        }
        return Arrays.copyOf(ans, k);
    }
}