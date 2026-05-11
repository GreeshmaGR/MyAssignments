package org.testleaf.week3.day1;

import java.util.Arrays;

public class FindDups {
    public static void main(String[] args) {
        int[] number={2,5,7,7,5,9,2,3};

        Arrays.sort(number);
        //0  1  2  3  4  5  6  7
       //2  5  7  7  5  9  2  3
        for (int i=0; i<number.length-1; i++){
        
        
            if ( number[i]==    number[i+1]) {

                System.out.println(number[i]);

                
                
            }







        }

    }
        }








        










        



