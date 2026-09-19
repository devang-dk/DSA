class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int c:nums){
            ans.put(c, ans.getOrDefault(c,0)+1);
        }
        int last=0;
        for(int i=1;i<nums.length+1;i++){
            if(!ans.containsKey(i)){
                return i;
            }else{
                last=i;
            }
        }
        return last+1;
    }
}