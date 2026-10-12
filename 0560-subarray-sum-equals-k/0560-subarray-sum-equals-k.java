class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> prefixsum = new HashMap<>();
        int count=0;
        int sum=0;
        // int[] pre= new int[nums.length];
        // pre[0]=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     pre[i]= pre[i-1] + nums[i];
        // }
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            if(sum==k){
                count++;
            }
            if(prefixsum.containsKey(sum-k)){
                count = count + prefixsum.get(sum-k);
            }
            prefixsum.put(sum, prefixsum.getOrDefault(sum,0)+1);
        }
        return count;
    }
}