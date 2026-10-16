class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int a=0;
        int Diff=Integer.MAX_VALUE;
        for(int i=a;i<arr.length-1;i++){
            Diff = Math.min(Diff, arr[i+1]-arr[i]);
        }
        for(int i=a;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==Diff){
                ans.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return ans;
    }
}