class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {//T(C(N))==O(1) and S(C(N))==O(1) as it requires Constant Time in A constant space
        if(p==null || q==null )return p==q;//checking if TreeNode's existance
        return (p.val==q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right); // Printing  Both the Tree's With Same Nodes
    }
}
