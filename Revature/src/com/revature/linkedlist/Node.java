package com.revature.linkedlist;
                // <T> Declares a custom generic type and can even extend classes in some instance.
public class Node<T> {
    //Overloading/riding covariance. Inheritance and polymorphism.
    //<T> Here is saying that it will be of ONE type that specify at the creation of the node.

    private T data;
    // Composition is emphasized here. You can build a hierarchy or composition. You almost
    // always want to build by composition. Top down vs bottom up.
    private Node<T> nextNode;

    public Node(T info, Node<T> next) {
        super();
        this.data = info;
        this.nextNode = next;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T newData) {
        this.data = newData;
    }

    public Node<T> getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(Node<T> newNode) {
        this.nextNode = newNode;
    }
}
