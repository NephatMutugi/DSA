package data_structures.trees;

import java.util.HashMap;
import java.util.Map;

public class BinaryTrees {

    private int [] postOrder;
    Map<Integer, Integer> treeMap = new HashMap<>();
    int index;
    public TreeNode buildTree (int [] inOrder, int [] postOrder){
        this.postOrder = postOrder;
        int n = inOrder.length;
        index = n - 1;

        for (int i = 0; i < n; i ++){
            treeMap.put(inOrder[i] , i);
        }

        return dfs(0, n - 1);
    }


    private TreeNode dfs(int start, int end){
        // Base Case
        if (start > end)
            return null;
        int currentVal = postOrder[index--];
        TreeNode currentNode = new TreeNode(currentVal);
        int midPoint  = treeMap.get(currentVal);

        currentNode.right = dfs(midPoint + 1, end);
        currentNode.left = dfs(start, midPoint -1);
        System.out.print(currentNode.val + " ");


        return currentNode;
    }
}
