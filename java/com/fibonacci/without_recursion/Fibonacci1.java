package com.fibonacci.without_recursion;

public class Fibonacci1 {
    public static void main(String args[]) {

        int n1 = 0;
        int n2 = 1;
        int n3;
        int i;
        int count = 10;

        System.out.println("Fibonacci bez użycia rekurencji");
        System.out.println(n1 + "\n" + n2);

        for(i=2; i<count; i++) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
