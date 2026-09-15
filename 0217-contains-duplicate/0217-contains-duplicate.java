class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map <Integer, Integer> map = new HashMap<>();
        for(int c:nums){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        
        for(int c:nums){
            if(map.get(c)>1){
                return true;
            }
        }
        return false;
    }
}