package com.palindrome;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Palindrome2 {
    public static void main(String args[])
    {
        String original;
        String reverse = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string/number to check if it is a palindrome");

        original = in.nextLine();
        int length = original.length();
        for(int i = length - 1; i>=0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if(original.equals(reverse)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
}
