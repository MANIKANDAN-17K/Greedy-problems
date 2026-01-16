class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int sum = 0;
        int cur = 0;
        for( int x : nums)
            sum += x;
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        List<Integer> res = new ArrayList<>();
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i = 0;i<nums.length;i++){
            res.add(arr[i]);
            cur += arr[i];
            if(cur > sum - cur) break;
        }
        return res;
    }
}
