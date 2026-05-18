package org.testleaf.week4.day1;

public class overRiding2 extends overRiding1{
    
public void takeSnap(){

    super.takeSnap();
        System.out.println("Take a high resolution snap");
    }
    
        public static void main(String[] args) {
        overRiding2 options =new overRiding2();
        options.takeSnap();
    

    }
}



