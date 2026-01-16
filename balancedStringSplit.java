class Solution {
    public int balancedStringSplit(String s) {
        int bal = 0;
        int cnt = 0;
        for(char c : s.toCharArray()){
            if(c == 'L') bal++;
            else if(c == 'R') bal--;
            if(bal == 0) cnt++;
        }
        return cnt;
    }
}
