class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int minfreq= Integer.MAX_VALUE;
        int element=-1;

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()<minfreq){
                minfreq=entry.getValue();
                element=entry.getKey();
            }
        }
        return element;
    }
}