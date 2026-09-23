class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int hourcount=0;
        int left=1;
        int right=0;
        for(int i=0;i<piles.length;i++){
            right = Math.max(right, piles[i]);
        }
        while(left<right){
            int mid=left+(right-left)/2;
            hourcount=0;
            for(int pile:piles){
                hourcount+= (pile+mid-1)/mid;
            }
            if(hourcount<=h){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return right;
    }
}