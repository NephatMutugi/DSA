package data_structures.linked_lists.customer;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String > placesToVisit = new LinkedList<>();
        placesToVisit.add("Castle Forest Lounge");
        placesToVisit.add("Ragia Forest");
        placesToVisit.add("Chalbi Desert");
        placesToVisit.add("Ngong Hills");
        placesToVisit.add("Mt. Suswa");
        placesToVisit.add("Mt. Kilimambogo");
        placesToVisit.add("Seven Ponds");
        printList(placesToVisit);

        placesToVisit.add(1, "Mt. Longonot");
        printList(placesToVisit);

        placesToVisit.remove(5);
        printList(placesToVisit);

    }

    private static void printList(LinkedList<String > linkedList){
        for (String s : linkedList) {
            System.out.println("Now visiting: " + s);
        }

        System.out.println("====================================");
    }
}
