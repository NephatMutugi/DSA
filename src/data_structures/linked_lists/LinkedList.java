package data_structures.linked_lists;

import java.util.HashSet;

/** {@code @Author} Nephat Muchiri */
public class LinkedList {
    static Node head = null;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null){
            head = node;
        } else {
            Node n = head;
            while (n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show(){
        Node node = head;
        while (node.next != null){
            System.out.print(node.data + ", ");
            node = node.next;
        }
        System.out.println(node.data);
    }
    public void rotate(int k){
        if (k == 0)
            return;
        Node currentNode = head;
        while (currentNode.next != null)
            currentNode = currentNode.next;

        currentNode.next = head;
        currentNode = head;

        // Transverse to k-1, which will be the last position of our linked list
        // and will point to null.
        // The k node should point to the previous head.
        for (int i = 0; i < k-1; i++)
            currentNode = currentNode.next;

        head = currentNode.next;
        currentNode.next = null;
    }

    public void removeDuplicates(){
        HashSet<Integer> hashSet = new HashSet<>();
        Node current = head;
        Node prev = null;
        while (current != null){
            int currentVal = current.data;
            if (hashSet.contains(currentVal)){
                prev.next = current.next;
            } else {
                hashSet.add(currentVal);
                prev = current;
            }
            current = current.next;
        }
    }

    public void deleteNodes(){
        Node node = head;
        if (node == null || node.next == null)
            return;
        Node slowNode, fastNode, prevNode;
        slowNode = fastNode = prevNode = node;
        while (fastNode != null && fastNode.next != null){
            prevNode = slowNode;
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        prevNode.next = slowNode.next;

    }
}
