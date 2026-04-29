# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def are_symm(self,p,q):
        if not p and not q:
            return True
        if not p or not q:
            return False
        if p.val != q.val:
            return False
        return (self.are_symm(p.left, q.right) and self.are_symm(p.right, q.left))
    def isSymmetric(self, root):
        return self.are_symm(root.left,root.right)
        
