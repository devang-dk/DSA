class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int pivot=-1;
        int pindex=0;
        int temp=0;
        int tindex=0;
        for(int i=0;i<nums.size()-1;i++){
            if(nums[i]<nums[i+1]){
                pivot=nums[i];
                pindex=i;
            }
        }
        for(int i=nums.size()-1;i>pindex;i--){
            if(nums[i]>nums[pindex]){
                temp=nums[i];
                tindex=i;
                break;
            }
        }
        if(pivot==-1){
            reverse(nums.begin(), nums.end());
            return;
        }
        swap(nums[pindex],nums[tindex]);
        reverse(nums.begin() + pindex+1, nums.end());
    }
};