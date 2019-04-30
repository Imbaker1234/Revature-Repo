package iteratorDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    /*
   // ================ITERATOR==================


    - An interface when implemented allows the implementing type to be the subject
    of a FOR EACH LOOP.

    - All of these implement the Iterable interface. Therefore every collection has an iterator.

    - Allows traversal between elements and safe removal of elements in place.

     */

    public static void main(String[] args) {
        // ================Create a collection. Utilizing the ArrayList.==================


        ArrayList<String> a1 = new ArrayList<String>();

        a1.add("C");
        a1.add("D");
        a1.add("E");
        a1.add("A");
        a1.add("H");
        a1.add("B");
        a1.add("G");
        a1.add("F");

        // ================USE ITERATOR TO DISPLAY CONTENTS OF A1==================

        System.out.println("Original Contents of A1");

        a1.sort(String::compareToIgnoreCase);
        Iterator<String> itr = a1.iterator();

        ListIterator<String> litr = a1.listIterator();

        //ITERATE THROUGH THE LIST
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        //ITERATE THROUGH A MODIFIED LIST
        System.out.println(":::Modified Contents:::");

        while (litr.hasNext()) {
            String element = litr.next();
            System.out.println(element + "+");
        }

        //FOR EACH LOOP PRINTING A SORTED ARRAY


        System.out.println(":::FOR EACH PRINTING A SORTED ARRAY:::");
        for (String element: a1) {
            System.out.println(element);
        }

        //ITERATE THROUGH A LIST IN REVERSE
        while (litr.hasPrevious()) {
            String element = litr.previous();
            System.out.println(element + " ");
        }


        System.out.println();




//        System.out.println(a1.sort();)


    }


}
