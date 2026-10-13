class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            ans.add(nums[i]);
        }
        int longest=0;
        for(int num:ans){
            if(!ans.contains(num-1)){
                int current = num;
                int count=1;

                while(ans.contains(current+1)){
                    current++;
                    count++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}