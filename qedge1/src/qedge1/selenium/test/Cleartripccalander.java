package qedge1.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Cleartripccalander {

	public static void main(String[] args) {
		String date="18/August/2018";
		String[] temp=date.split("/");
		String dt,month,year;
		dt=temp[0];
		month=temp[1];
		year=temp[2];

			System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
			WebDriver driver =new FirefoxDriver();
			driver.get("http:\\clearTrip.com/");
			driver.findElement(By.id("DepartDate")).click();
			String caldt,calmonth,calyear;
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
			while (!calyear.equals(year))
			{
			   driver.findElement(By.className("nextMonth")).click();
			   calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
					
			}
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
			while (!calmonth.equalsIgnoreCase(month))
				
			{
				driver.findElement(By.className("nextMonth")).click();
				calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
				
			}
			WebElement cal=driver.findElement(By.className("calendar"));
		
			List<WebElement> rows=cal.findElements(By.tagName("tr"));
			 boolean flag=false;
			for (int i = 0; i < rows.size(); i++) 
			{
			   List<WebElement>	cols=rows.get(i).findElements(By.tagName("td"));
			   for (int j = 0; j < cols.size(); j++) 
			   {
				 cols.get(j).click();
				 flag=true;
				 break;
				 
			}
			   if (flag)
			   {
				    break;
				
			   }
			}

	}

}
