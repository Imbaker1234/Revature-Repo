package imbstudentdatabas;

import static imbstudentdatabas.Manager.decisionTree;

public class Main {
    //Variable Declaration


    //Methods
    public static void main(String[] args) {
        Manager.getInstance();
        Manager.currentTree = "Main Menu";
        while (1 != 0) { //There is an exit clause within the decisionTree method.
            decisionTree();
            }


        }

    }
