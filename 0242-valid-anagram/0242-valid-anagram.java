class Solution {
    public boolean isAnagram(String s, String t) {
        int[] ans = new int[52];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='A' && c<='Z'){
                ans[c-'A']++;
            }else{
                ans[26+c-'a']++;
            }
        }
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(c>='A' && c<='Z'){
                ans[c-'A']--;
            }else{
                ans[26+c-'a']--;
            }
        }
        for(int count: ans){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}