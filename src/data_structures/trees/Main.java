package data_structures.trees;

public class Main {
    public static void main(String[] args) {
        BinaryTrees binaryTrees = new BinaryTrees();
        LowestCommonAncestor ancestor = new LowestCommonAncestor();
        int [] inOrder = {9,3,15,20,7};
        int [] postOrder = {9,15,7,20,3};

        System.out.println("Root Node:\t" + binaryTrees.buildTree(inOrder, postOrder).val);
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(5);
        node.left.left = new TreeNode(6);
        node.left.right = new TreeNode(2);
        node.left.right.left = new TreeNode(7);
        node.left.right.right = new TreeNode(4);
        node.right = new TreeNode(1);
        node.right.right = new TreeNode(8);
        node.right.left = new TreeNode(0);

        ancestor.lowestCommonAncestor(node, node.left, node.right);

    }
}
