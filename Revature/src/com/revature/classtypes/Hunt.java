package com.revature.classtypes;

public interface Hunt {
    /*
    * Special type of class that cannot be instantiated

    * Specifies what a class must must do, but not how it does it. (Sounds like abstraction!)

    * Does not have any instance variables because you'd have to instantiate it for those to be useful.

    * Methods are declared without any behavior or body. *(can be)

    * Prior to java 8 you could not associate behavior with the methods of an interface.

    * Methods declared without a body are (abstract)

    * All variables are implicity public static and final. (Static + Final = _CONSTANT_)

    * Interfaces an extend each other, can have multiple. They can also implement other Interfaces (0 to many)

    - Marker Interface - This is an interface with no attributes or behaviors. Used to tie multiple classes together.
      for example "SERIALIZABLE". Tells the compiler it is of a certain type. AKA Serializable.
     */

    void findPrey();

}
