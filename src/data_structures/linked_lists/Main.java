package data_structures.linked_lists;


public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(30);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.insert(60);
        list.insert(70);

        // Print Original List
        System.out.print("ORIGINAL LIST:\t\t\t");
        list.show();

        // Print after removing duplicates
        System.out.print("REMOVE DUPLICATES:\t\t");
        list.removeDuplicates();
        list.show();

        // Print after rotating the list
        System.out.print("ROTATE LIST:\t\t\t");
        list.rotate(4);
        list.show();


        // DELETE MIDDLE ELEMENT FROM LINKED LIST
        list.deleteNodes();
        System.out.print("LIST AFTER DELETION:\t");
        list.show();

    }
}
