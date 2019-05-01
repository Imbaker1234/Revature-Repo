package com.revature.linkedlist;
// <T> is allowing us to declare a generic type parameter so that we can instantiate a "MyLinkedList" of
// ANY type.

//Linked list - CRUD Functionality - Create, Read, Update, Delete.
//Nodes - The chain links that make up the actual objects or data that we will be working with.
public class MyLinkedList<T> {
    //RAW DEFINITION: Raw Means ANY data Type
    //Note to self. Gain a proper representation of generic type.

    //"int" is a primitive data type. "Integer" is an object representation of an int and is used as a
    //wrapper class. There is a wrapper class for every single primitive type that allow these primitives
    //to access some useful methods and also pass as an object in Collections that require them.

    //The Root Node of our linked list, also called the 'head'. This gives you a place to start for
    //traversal methods.
    private Node<T> head;

    // The end node of our linked list, called the 'tail'. While not 100% necessary it makes this far more
    // efficient to keep this value around for the purposes of being able to quickly add to the LinkedList.
    private Node<T> tail;

    // Insert a node at the end of the linked list.

    public void insert(T data) {

        // Create a new node object whose nextNode value is null, and contains some data
        Node<T> newNode = new Node<>(data, null);

        //If the head of this linked list == null, then the new node will become the first and last
        //element of this list.
        if(this.head == null) {
            System.out.println("List is empty...adding first element");
            this.head = newNode;
            this.tail = newNode;
        }

        //If there are elements in the linked list, then we will select the tail. Set its next node to
        //the new node we just created, and then set the tail to the newly added node.

        else {
            System.out.println("List has contents.... Adding new node to the tail of the list.");
            this.tail.setNextNode(newNode);
            this.tail = newNode;
        }
    }

    //Implement a Peek Method

    //Implement a Pull Method

    //Implement a Remove Method

    //Implement a Remove Duplicates Method

    //Convenience method for printing the list contents that isn't included inside the actual linked list.
    public void printList() {

        //Start with the head of this list.
        Node<T> currentNode = this.head;

        //While currentNode is not equal to null, print ou the node information and move on to the next node.
        while(currentNode != null) {
            System.out.println("Node Value: " + currentNode.getData());
            //Switches to the next node until it runs out of nodes. Linearly traverses the list.
            currentNode = currentNode.getNextNode();
        }
    }

}
