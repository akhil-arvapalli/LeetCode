class Solution {
    // static {
    //     for (int i = 0; i < 60; i++) {
    //         maxArea(new int[]{0, 0});
    //     }
    // }
    public static int maxArea(int[] height){
        int maxArea = 0, left = 0 , right = height.length - 1;
        while (left < right) {
            int h = Math.min(height[right],height[left]);
            maxArea = Math.max(maxArea, (right - left) * h);

            while(left < right && h >=height[left]) left++;
            
            while(left < right && h >= height[right]) right--;
        } 
        return maxArea;
    }
}