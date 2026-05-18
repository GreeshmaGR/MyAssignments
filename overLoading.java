package org.testleaf.week4.day1;

public class overLoading {

    public void reportStep(String msg,String status){
        System.out.println(msg);
 }
 public void reportStep(String msg,String status, boolean snap){
    System.out.println(msg);
    System.out.println(status);
    System.out.println(snap);
}
  public static void main(String[] args) {
    overLoading loadopts=new overLoading();
    loadopts.reportStep("overloading", "Completed");
    loadopts.reportStep("overloading", "Completed", false);

  }


}
