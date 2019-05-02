package com.revature.bubblesort;

public class reverseBubbleSort {

        public static void main(String[] args) {
            int test[] = {10,22,48,73,4,19,21};
            reverseBS(test);

            // Show results
            for (int i = 0; i < test.length; i++) {
                System.out.print(test[i] + " ");
            }
        }

        public static void reverseBS(int[] arr) {
            int numberOfIterations = arr.length;
            int previousIndex = 0;
            for(int i=0; i < numberOfIterations; i++){
                for(int currentIndex=1; currentIndex < (numberOfIterations-i); currentIndex++){
                    //Check to see how the 2 values compare
                    //The direction of the angle bracket determines
                    //The direction of the bubble sort
                    if(arr[currentIndex-1] < arr[currentIndex]){
                        //This is where we actually swap the index values.
                        previousIndex = arr[currentIndex-1];
                        //If the previous node is larger it slides to the left.
                        arr[currentIndex-1] = arr[currentIndex];
                        //and in turn the index to the left slides to the right
                        arr[currentIndex] = previousIndex;
                    }
                    //Otherwise we just jump to the next iteration.
                }
            }

        }
    }
