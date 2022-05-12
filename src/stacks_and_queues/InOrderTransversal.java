package stacks_and_queues;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTransversal {
    public List<Integer> inOrderTransversal(stacks_and_queues.TreeNode root){
        Stack<stacks_and_queues.TreeNode> stack = new Stack<>();
        List<Integer> outputArr = new ArrayList<>();

        if (root == null){
            return outputArr;
        }
        TreeNode current = root;

        while (current != null || !stack.isEmpty()){
            while (current != null){
                stack.push(current);
                current = current.left;

            }
            current = stack.pop();
            outputArr.add(current.val);
            current = current.right;
        }
        return outputArr;
    }
}
