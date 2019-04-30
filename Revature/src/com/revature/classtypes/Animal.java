package com.revature.classtypes;

public abstract class Animal {
    /*
    - A special type of class that cannot be instantiated.

    - In  order for a class to be considered abstract it must contain at least one abstract method.

    - However they CAN contain concrete(defined) methods.

    - Abstract classes are considered to be contract based.

    -CONTRACT BASED: Our abstract methods MUST be overridden in a subclass.
     */

    public abstract void breathe();
}
