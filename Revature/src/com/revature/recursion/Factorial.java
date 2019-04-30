package com.revature.recursion;

public class Factorial {

    /*
    -   5!= 5*4*3*2*1
    */

    int bangFact(int n) {
        int result;
        if(n==1) return 1;
        result = bangFact((n -1) * n);
        return result;
    }


}
