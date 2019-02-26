package qedge1.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Apsrtclink {
	
	
	public static void main(String[] args) {
		

	
	System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
	WebDriver driver =new FirefoxDriver();
	driver.manage().deleteAllCookies();
	
	driver.get("https://apsrtconline.in/oprs-web/");
	
	//String linkname="eTicket Login";
	//try {
		
	//	driver.findElement(By.linkText(linkname));
		//System.out.println(linkname+" is present ,test pass");
	//	} 
	//catch (Exception e) 
	//{
	  // System.out.println(linkname+" is not present ,test fail");
		
	//}
		String actlnk="eTicket Login";
	driver.findElement(By.className("menu-wrap"));
	driver.findElement(By.className("menu"));
	 driver.findElement(By.xpath("html/body/div[3]/div/a"));
		List<WebElement> links=driver.findElements(By.xpath("html/body/div[3]/div/a"));
		boolean linkexist=false;
		System.out.println(links.size());
	for (int i = 0; i <links.size(); i++) 
	{
	     String explnk=links.get(i).getText();
		if (explnk.equalsIgnoreCase(actlnk)) 
		{
				 linkexist=true;
				break;
			}
		}
	
			if (linkexist) 
			{
				System.out.println(actlnk+"in present ,test pass");
				
			}
			else
			{
				System.out.println(actlnk+"in not preseent ,test fail");
			}
			
		}
		
	}




