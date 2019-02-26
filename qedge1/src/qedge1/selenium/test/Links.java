package qedge1.selenium.test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Links {

	public static  void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.get("http:\\primusBank.qedgetech.com:9090/");
		driver.findElement(By.linkText("Site Map")).click();
		
		
		
  // List  <WebElement> Links =driver.findElements(By.tagName("a")) ;   
   
   List  <WebElement> Links =driver.findElements(By.tagName("a")) ; 
   System.out.println(Links.size());
    
    
    for (int i=0; i<Links.size();i++)
   {
    
	String LinkName=Links.get(i).getText();
       System.out.println(LinkName);
       
    }
 	
	}

	
}