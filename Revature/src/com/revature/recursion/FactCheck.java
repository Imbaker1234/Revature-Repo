package com.revature.recursion;

public class FactCheck {

    public static void main(String[] args) {
        Factorial f = new Factorial();

        for (int i = 1; i < 6; i++) {
            System.out.println("Factorial of " + i + " is " + f.bangFact(i));
        }

    }

}
