# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def valid(self,root,arr):
        if not root:
            return
        self.valid(root.left,arr)
        arr.append(root.val)
        self.valid(root.right,arr)
    def isValidBST(self, root):
        arr=[]
        self.valid(root,arr)

        for i in range(0,len(arr)):
            if i==len(arr)-1:
                return True
            if not(arr[i]<arr[i+1]):
                return False

