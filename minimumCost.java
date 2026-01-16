class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int candies = 0;
        int n = cost.length;
        int val =1;
        for(int i = n -1;i>= 0;i--){
            if(val % 3 != 0){
                candies += cost[i];
                val++;
            }else{
                val = 1;
            }
        }
        return candies;
    }
}
