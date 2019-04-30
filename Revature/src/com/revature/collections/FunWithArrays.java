package com.revature.collections;

import com.revature.blueprints.RocketShip;

public class FunWithArrays {
    /*
     * Arrays in Java are f ixed length/type unlike Javascript where rules don't
     * matter */

    public static void main(String[] args) {
//        // int array with 5 elements
//        int[] myArray= new int[5];
//        myArray[3] = 3;
//
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]);
//        }
//        //Array Literal
//        int[] myArray2 = {1,3,4,2,6,7,3,8,9,2004}; //11 Elements
//        //Take each element, multiply by 15 and then print the array.
//        for (int i = 0; i < myArray2.length; i++) {
//            myArray2[i] *= 15;
//        }
//        for (int i = 0; i < myArray2.length; i++) {
//            System.out.println(myArray2[i]);
//        }
//        smurfizeIt();
//
//
    RocketShip rs1 = new RocketShip("Fred", 20001, 9001,false);
    RocketShip rs2 = new RocketShip("Stuart", 17, 7, true);
    RocketShip rs3 = new RocketShip("Kelly", 45, 7, false);
    RocketShip rs4 = new RocketShip("Donald", 17, 7, true);
    RocketShip rs5 = new RocketShip("Austin", 17, 7, true);
    RocketShip rs6 = new RocketShip("Kyle", 17, 7, true);
    RocketShip rs7 = new RocketShip("Joe", 17, 7, true);
    RocketShip rs8 = new RocketShip("Jelly", 17, 7, true);
    RocketShip rs9 = new RocketShip("Belly", 17, 7, true);

    rocketshipArray[0] = rs1;
    rocketshipArray[1] = rs2;
    rocketshipArray[3] = rs3;
    rocketshipArray[10] = rs4;
    rocketshipArray[11] = rs5;
    rocketshipArray[20] = rs6;
    rocketshipArray[26] = rs7;
    rocketshipArray[2] = rs8;
    rocketshipArray[12] = rs9;
//        System.out.println("The fuel capacity for rs3 is : " + rocketshipArray[3].getFuelCapacity());

        doYouShipIt();
    }

    //In a method make a string array and then add something to those elements.

//    public static void smurfizeIt() {
//        String[] names = {"Aaron", "Pedro", "Ian", "Austin", "Kelly", "Daniel", "Gary", "Kevin", "Justin", "Rodel", "Nick", "Chris", "Joel", "Richelle", "Josh", "Kass", "Tucker", "Donald", "Stuart", "Janie"};
//        for (int i = names.length - 1; i >= 0; i--) {
//            System.out.println("Smurf-" + names[i]);
//        }
//    }
//    public static void funStringArray() {
//        String [] a = {"Matt", "Tiff", "Trevor", "Gavin"};
//            for (int i = a.length-1; i <= 0; i--) {
//                a[i]= a[i] + " Knighten";
//                System.out.println(a[i]);
//            }
//    }

    // In a Method, Print off a Rocketship if it does not have a minifridge, or the number of rockets
    //greater than 5.

    static RocketShip[] rocketshipArray= new RocketShip[27];

    public static void doYouShipIt() {
        for (int i = 0; i < rocketshipArray.length; i++) {
            if((rocketshipArray[i] != null) && ((rocketshipArray[i].isMiniFridge() == false) || (rocketshipArray[i].getNumOfThrusters() > 5))) {
                System.out.println(rocketshipArray[i].toString());
                System.out.println("");
            }
        }
    }
}