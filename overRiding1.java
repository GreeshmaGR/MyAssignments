package org.testleaf.week4.day1;

public class overRiding1 {
    public void takeSnap(){
        System.out.println("Take a snapshot");
    }
    public void reportStep(){
        System.out.println("print the report");
    }
    public static void main(String[] args) {
        overRiding1 options=new overRiding1();
        options.takeSnap();
        options.reportStep();
    }

}
