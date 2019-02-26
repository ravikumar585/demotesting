package qedge1.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Findlinks {

	
	

	public static  void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.get("http:\\primusBank.qedgetech.com/");
		driver.findElement(By.linkText("Site Map")).click();
		
		
		
  // List  <WebElement> Links =driver.findElements(By.tagName("a")) ;   
   
   List  <WebElement> Links =driver.findElements(By.tagName("a")) ; 
   System.out.println(Links.size());
    
    
 
for (WebElement objCurrentLink :Links )
   {
	
          String strLinktext=objCurrentLink.getText();
       System.out.println(strLinktext);
   }
	}
}


