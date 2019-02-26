package qedge1.selenium.test;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Redirect {

	public static void main(String[] args) 
	{
	    
		    
		     System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
				WebDriver driver =new FirefoxDriver();

			     String exptitle,actitle;
			     exptitle="gmail";
			     actitle= driver.getTitle();
		     
		    if (actitle.toLowerCase().contains(exptitle.toLowerCase()))
		    {
				
		    	 System.out.println("Gmail Link Test Pass");
		 		
			} else {
				 System.out.println("Gmail Link Test fail");
					

			}
		    driver.close();
		    	 
		}

}
