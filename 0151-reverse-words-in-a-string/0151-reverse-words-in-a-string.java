class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        String[] result = s.trim().split("\\s+");
        for(int i=result.length-1;i>=0;i--){
            ans.append(result[i]);
            if(i!=0){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}