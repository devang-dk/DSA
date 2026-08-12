class Solution {
    public int[] rearrangeArray(int[] nums) {
        int odd=1;
        int even=0;
        int[] result = new int[nums.length];
        for(int num: nums){
            if(num>=0){
                result[even]=num;
                even+=2;
            }else{
                result[odd]=num;
                odd+=2;
            }
        }
        return result;
    }
}