package data_structures.strings;

import java.util.LinkedList;
import java.util.List;

public class RestoreIPAddresses {
    static List<String> myIpAddresses = new LinkedList<>();
    public static List<String> restoreIpAddresses(String s) {
        if (s.length() == 0) return myIpAddresses;

        dfs(new StringBuilder(), s, 4);

        return myIpAddresses;
    }

    private static void dfs(StringBuilder str, String s, int sections){
        int n = s.length();
        if (n == 0 && sections == 0){
            myIpAddresses.add(str.substring(0,str.length()-1));
            return;
        }

        if (n > 0 && sections == 0) return;
        if (n == 0 && sections > 0) return;

        StringBuilder sb = new StringBuilder();
        int min = Math.min(s.length(), 3);

        for (int i = 0; i < min; i++){
            sb.append(s.charAt(i));
            int val = Integer.parseInt(sb.toString());

            // Validate the values
            if (sb.length() == 2 && val < 10) continue;
            if (sb.length() == 3 && val < 100) continue;
            if (sb.length() == 3 && val > 255) continue;


            // Try all combinations for the current String
            StringBuilder temp = new StringBuilder(str.toString());
            str.append(sb);
            str.append(".");
            dfs(str, s.substring(i+1), sections-1);
            str = temp;

            // Reset our string for next
        }
    }

    public static void main(String[] args) {
        String ipAddress = "25525511135";
        List<?> myList = restoreIpAddresses(ipAddress);

        for (int i = 0; i < myList.size(); i++) {
            System.out.println("IP " + (i +1) + " -> " + myList.get(i));
        }

        System.out.println();
    }
}
