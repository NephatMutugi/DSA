package data_structures.strings;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        RestoreIPAddresses restoreIPAddresses = new RestoreIPAddresses();

        String ipAddress = "25525511135";
        List<?> myList = restoreIPAddresses.restoreIpAddresses(ipAddress);

        for (int i = 0; i < myList.size(); i++) {
            System.out.println("IP " + (i +1) + " -> " + myList.get(i));
        }

        System.out.println();
    }
}
