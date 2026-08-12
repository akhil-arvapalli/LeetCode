class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        l = 0 
        r = n-1
        ans = 0 
        while l < r:
            h = min(height[l],height[r])
            ans = max(ans,h*(r-l))

            while l<r and h>=height[l] :
                l+=1
                
            while l<r and h>=height[r] :
                r-=1
        return ans