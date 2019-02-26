package qedge1.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkboxinorderornot {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://spicejet.com");
		WebElement fromlist=driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
//	Select fromlist=new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")));
		Thread.sleep(5000);
		String  str1,str2;
		List<WebElement> cities;
		cities=((Select) fromlist).getOptions();
		boolean ordered=true;
		for (int i = 2; i <cities.size(); i++) 
		{
			str1=cities.get(i-1).getText();
			str2=cities.get(i).getText();
			if (str2.compareToIgnoreCase(str1) <0) 
			{
				 ordered=false;
				 break;
				
			}
			if(ordered)
		    {
		    	System.out.println("cities are the ordered ,test pass");
		    }
		    else
		    {
		     	System.out.println("cities are ot ordered,test fail");
		    }
		    
		    }
			
			
		}
		

	}


