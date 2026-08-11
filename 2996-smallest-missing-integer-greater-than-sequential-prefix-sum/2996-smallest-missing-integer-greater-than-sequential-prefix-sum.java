import java.util.*;
class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        int pre = nums[0];
        int n = nums.length;
        int[] arr =new int[n];
        for(int i =1 ; i < nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                pre+=nums[i];
            }else{break;}
        }
        for(int num : nums){
            st.add(num);
        }
        int x = pre;
        while(st.contains(x)) x++;
        return x;
    }
}
    