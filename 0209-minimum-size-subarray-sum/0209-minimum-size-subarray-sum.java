class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int windowsum=0;
        int left=0;
        int minLen = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            windowsum+=nums[i];
            while(windowsum>=target){
                minLen = Math.min(minLen, i-left+1);
                windowsum-=nums[left];
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE?0:minLen;
    }
}