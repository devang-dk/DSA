class Solution {
    public void nextPermutation(int[] nums) {
        int right=nums.length-1;
        int left=-1;
        while(right>0){
            if(nums[right]>nums[right-1]){
                left=right-1;
                break;
            }
            right--;
        }
        if (left == -1) {
            reverse(nums, 0);
            return;
        }
        right=nums.length-1;
        while(right>left){
            if(nums[right]>nums[left]){
                swap(nums, left , right);
                break;
            }
            right--;
        }

        reverse(nums,left+1);
        
    }

    public void swap(int nums[], int left, int right){
        int temp = nums[left];
        nums[left]= nums[right];
        nums[right]=temp;
    }

    public void reverse(int nums[], int left){
        int right=nums.length-1;
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}