class Solution {
    public String removeOuterParentheses(String s) {
        int balance=0;
        int left=0;
        int right=0;
        StringBuilder ans = new StringBuilder();
        while(right<s.length()){
            if(s.charAt(right)=='('){
                balance++;
            }else{
                balance--;
            }

            if(balance==0){
                ans.append(s,left+1,right);
                left=right+1;
            }
            right++;
        }
        return ans.toString();
    }
}