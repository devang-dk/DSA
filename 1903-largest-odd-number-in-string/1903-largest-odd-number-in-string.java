class Solution {
    public String largestOddNumber(String num) {
        StringBuilder ans = new StringBuilder();
        int right=num.length()-1;
        while(right>=0){
            if(num.charAt(right)%2!=0){
                ans.append(num,0,right+1);
                break;
            }
            right--;
        }
        return ans.toString();
    }
}