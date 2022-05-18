package data_structures.stacks;

import java.util.Stack;

public class ValidStrings {
    public static void main(String[] args) {
        String test = "{([[{()}]])}";
        validString(test);
    }

    public static void validString(String inputString){
        Stack<Character> charStack= new Stack<>();
        for (char ch : inputString.toCharArray()){
            if (ch == '(' || ch == '{' || ch == '['){
                charStack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']'){
                if (charStack.isEmpty()){
                    System.out.println(inputString + " :->is invalid");
                    return;
                } else {
                    char topValue = charStack.peek();
                    if (topValue == '(' && ch == ')' || topValue == '{' && ch == '}'
                            ||topValue == '[' && ch == ']'){
                        charStack.pop();
                    } else {
                        System.out.println(inputString + " :->is invalid");
                        return;
                    }
                }
            }
        }

        if (!charStack.isEmpty()){
            System.out.println(inputString + " :->is invalid");
        } else
            System.out.println(inputString + " :->is valid");

    }
}
