class Solution(object):
    def isany(self, root, count, targetSum):
        if not root:
            return False
        
        count += root.val
        if not root.left and not root.right:
            return count == targetSum
        
        return self.isany(root.left, count, targetSum) or \
               self.isany(root.right, count, targetSum)

    def hasPathSum(self, root, targetSum):
        if not root:
            return False
        return self.isany(root, 0, targetSum)   # start from 0
