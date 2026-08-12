class Solution:
    def findMin(self, nums: list[int]) -> int:
        start = nums[0]
        l = 0 
        r = len(nums) - 1 
        ans = nums[0]      

        while l <= r:    
            cur = l + (r - l) // 2  
            
            ans = min(ans, nums[cur])  

            if nums[cur] >= start:     
                l = cur + 1
            else:
                r = cur - 1

        return ans