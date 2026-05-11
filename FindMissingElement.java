package org.testleaf.week3.day1;

import java.util.Arrays;

public class FindMissingElement {
//main method 
public static void main(String[] args) {
     int [] arr={1,4,3,2,8,6,7};
     //0  1  2  3  4  5  6
     //1  4  3  2  8  6  7
     //arrange in order
     Arrays.sort(arr);
     
     //use for loop for iteration
     for(int i=0; i<arr.length;  i++){

     //if condition
        if ( arr[i] != i+1){

            //print out statement
            System.out.println("missing element:" +(i+1) );
            break;

            

        }





     }





    




        


    }

}
