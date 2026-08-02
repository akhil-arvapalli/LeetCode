class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        // dp[0]=a[0];
        int prev = 0;
        int prev2 =0;

        for(int i = 0 ; i < nums.length ;i++){
            int take=nums[i];
            if(i>1) take+= prev2;
            int no=0+prev;
            int cur = Math.max(take,no);
            prev2=prev;
            prev = cur;
        }
        return prev;
        }
}