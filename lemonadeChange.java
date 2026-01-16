class Solution {
    public boolean lemonadeChange(int[] bills) {
        int d5 = 0,d10 = 0;
        for(int x : bills){
            if(x == 5){
                d5++;
            }else if(x == 10){
                if(d5 > 0){
                    d5--;
                    d10++;
                }else{
                    return false;
                }
            }else{
                if(d5 > 0 && d10 > 0){
                    d5--;
                    d10--;
                }else if(d5 > 2){
                    d5 -= 3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
