package com.hackerrank.solutions;

import java.util.Scanner;

public class ReducedString {
    static String super_reduced_string(String s){
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                s = s.substring(0,i-1) + s.substring(i+1);
                i=0;
            }
        }
        if(s.isEmpty())
            return "Empty String";
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}