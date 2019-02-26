
 package qedge1.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Spejectdemo {
	
public static void main(String[] args) 
{
	
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.get("http://spicejet.com");
		//WebElement fromelement= driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		Select selist=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")));	
		//Select selist=new Select(fromelement);
		String expcity="Hyderabad";
		List <WebElement> cities;
		cities=selist.getOptions();
		Boolean cityexist=false;
		for (int i = 0; i <cities.size();i++) 
		{
			String actcity=cities.get(i).getText();
		if (actcity.toLowerCase().contains(expcity)) 
		{
			cityexist=true;
			break;	
		}
		if (cityexist) 
		{
			 System.out.println(expcity + " is persent in the list ,test pass");
		}
		else
		{
			 System.out.println(expcity + " is not persent in the list ,test fail");
		}
		}
			
		}		
}
