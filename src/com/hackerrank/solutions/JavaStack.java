package com.hackerrank.solutions;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code
            char[] c = input.toCharArray();
            System.out.println(isBalanced(c));
        }

    }

    static boolean isBalanced(char[] arr) {
        Stack stack = new Stack();
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
                stack.push(arr[i]);
            }

            if (arr[i] == ')' || arr[i] == '}' || arr[i] == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else if (!isMatchingPair((char) stack.pop(), arr[i])) {
                    return false;
                }
            }
        }
        if (stack.isEmpty())
            return true; /*balanced*/
        else {   /*not balanced*/
            return false;
        }
    }

    static boolean isMatchingPair(char character1, char character2) {
        if (character1 == '(' && character2 == ')')
            return true;
        else if (character1 == '{' && character2 == '}')
            return true;
        else if (character1 == '[' && character2 == ']')
            return true;
        else
            return false;
    }
}
