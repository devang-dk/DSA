class Solution {
    public int firstMissingPositive(int[] nums) {
        int max=0;
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int c:nums){
            ans.put(c, ans.getOrDefault(c,0)+1);
            max = Math.max(max,c);
        }
        // if(max=0)
        for(int i=1;i<=max;i++){
            if(!ans.containsKey(i)){
                return i;
            }
        }
        return max+1;
    }
}