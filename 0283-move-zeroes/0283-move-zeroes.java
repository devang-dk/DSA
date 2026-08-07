class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;
        int right=1;
        while(right<nums.length){
            if(nums[left]==0 && nums[right]!=0){
                swap(nums, left, right);
                left++;
                right++;
            }else if(nums[left]==0 && nums[right]==0){
                right++;
            }else{
                right++;
                left++;
            }
        }
    }

    public void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left]= nums[right];
        nums[right]=temp;
    }
}