class Solution:
    def maxSubarrayLength(self, nums: List[int], k: int) -> int:
        freq = defaultdict(int)
        l=0
        cnt = 0 
        for r in range(len(nums)):
            cur = nums[r]
            freq[cur]+=1
            while freq[cur] > k :
                freq[nums[l]]-=1
                l+=1
            cnt = max(cnt,r-l+1)
        return cnt