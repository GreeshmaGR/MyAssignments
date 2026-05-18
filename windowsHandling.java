package org.testleaf.week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsHandling {
    public static void main(String[] args) {
        
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.irctc.co.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//label[text()='FLIGHTS']")).click();
        String newtab = driver.getTitle();
        System.out.println("newtab:"+ newtab);
        
        Set<String> irctcwindow = driver.getWindowHandles();
        List<String> allTabs=new ArrayList<String>(irctcwindow);
        String oldTab = allTabs.get(0);
        driver.switchTo().window(oldTab);
        driver.close();
        




        
        
          




        


    }

}
