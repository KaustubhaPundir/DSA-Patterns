class Solution(object):
    def missingNumber(self, nums):
        n=len(nums)
        ans=0
        for i in range(1,n+1):
            ans=ans^i
        for i in nums:
            ans=ans^i
        return ans

        
