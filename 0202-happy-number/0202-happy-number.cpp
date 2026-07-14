class Solution {
public:
    bool ans(int n, unordered_set<int>& seen){
        if(seen.count(n)){
            return false;
        }
        if(n==1){
            return true;
        }
        seen.insert(n);
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
        return ans(sum,seen);
    }
    bool isHappy(int n) {
       unordered_set<int> seen;
       return ans(n, seen);
    }
};