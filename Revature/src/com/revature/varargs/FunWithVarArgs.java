package com.revature.varargs;

public class FunWithVarArgs {
    //Var args- Variable Length Arguments
    // A method parameter that will take a variable number of arguments.
    // must be the last argument
    // can be of any type

    public static void main(String[] args) {

        vaTest(19);
        vaTest(1,4,5,6,7,8,9,11,23);

    }

    public static void vaTest(int ... V){ //... Is how we declare var args.
        //Automates and hides the process of creating and saving the values into an array
        //Prior to invoking the method.
        System.out.println("Number of arguments is " + V.length + " Contents:");

        //For each/Augmented For Loop- used with collections

        for (int x: V) {
            System.out.println(x);
        }
    }
}
