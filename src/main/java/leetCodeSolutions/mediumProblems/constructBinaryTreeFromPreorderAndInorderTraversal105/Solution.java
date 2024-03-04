package leetCodeSolutions.mediumProblems.constructBinaryTreeFromPreorderAndInorderTraversal105;

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0,0,inorder.length-1,preorder,inorder);
    }
    public TreeNode helper(int preStart, int inStart,int inEnd, int[] preOrder, int[] inOrder){
        if(preStart > preOrder.length-1 || inStart > inEnd) return null;

        TreeNode root = new TreeNode(preOrder[preStart]);
        int inIndex = 0;
        for(int i = inStart;i<=inEnd;i++){
            if(root.val == inOrder[i]){
                inIndex = i;
            }
        }
        root.left = helper(preStart+1,inStart,inIndex-1,preOrder,inOrder);
        root.right = helper(preStart+inIndex-inStart+1,inIndex+1,inEnd,preOrder,inOrder);

        return root;
    }
}
