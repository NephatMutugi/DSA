package data_structures.strings;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Restore IP Addresses

        RestoreIPAddresses restoreIPAddresses = new RestoreIPAddresses();
        String ipAddress = "25525511135";
        List<?> myList = restoreIPAddresses.restoreIpAddresses(ipAddress);
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("IP " + (i +1) + " -> " + myList.get(i));
        }
        System.out.println("##################################\n");

        // Valid Palindrome
        ValidPalindrome palindrome = new ValidPalindrome();
        String palindromeTest = "A man, a plan, a canal: Panama";
        System.out.println("Is palindrome -> " + palindrome.isPalindrome(palindromeTest));
    }
}
