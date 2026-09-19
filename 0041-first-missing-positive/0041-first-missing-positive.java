class Solution {
    public int firstMissingPositive(int[] nums) {
        int left=0;
        while(left<nums.length){
            if(nums[left] <= 0 || nums[left] > nums.length){
                left++;
            }else if(left==nums[left]-1){
                left++;
            }else if(nums[left] == nums[nums[left] - 1]){
                left++;
            }
            else{
                swap(nums,left,nums[left]-1);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}