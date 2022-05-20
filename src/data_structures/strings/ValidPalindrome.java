package data_structures.strings;


public class ValidPalindrome {
     public boolean isPalindrome (String s){
         StringBuilder stringBuilder = new StringBuilder();
         for (char c: s.toCharArray()){
             if (Character.isDigit(c) || Character.isLetter(c)){
                 stringBuilder.append(c);
             }
         }

         stringBuilder = new StringBuilder(stringBuilder.toString().toLowerCase());
         String fixedString = stringBuilder.toString();
         System.out.println("String to test -> " + fixedString);

         int pointer1 = 0;
         int pointer2 = fixedString.length() - 1;

         while (pointer1 <= pointer2){
             // Traverses to the middle and runs n/2
             if (fixedString.charAt(pointer1) != fixedString.charAt(pointer2)){
                 return false;
             }

             pointer1 += 1;
             pointer2 -= 1;
         }
         return true;
     }
}
