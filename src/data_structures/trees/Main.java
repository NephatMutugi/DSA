package data_structures.trees;

public class Main {
    public static void main(String[] args) {
        BinaryTrees binaryTrees = new BinaryTrees();
        int [] inOrder = {9,3,15,20,7};
        int [] postOrder = {9,15,7,20,3};

        System.out.println("Root Node:\t" + binaryTrees.buildTree(inOrder, postOrder).val);
    }
}
