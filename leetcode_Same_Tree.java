class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null )return p==q;//checking if TreeNode's existance
        return (p.val==q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right); // Printing  Both the Tree's With Same Nodes
    }
}
