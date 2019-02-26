package qedge1.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Calanderexample {
	
	public static void main(String[] args) 
	{
		String date="15/Oct/2019";
		String[] temp=date.split("/");
		String dt,month,year;
		dt=temp[0];
		month=temp[1];
		year=temp[2];

			System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
			WebDriver driver =new FirefoxDriver();
			driver.get("http:\\orangehrm.qedgetech.com/");
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	        driver.findElement(By.name("txtPassword")).sendKeys("Admin");
			driver.findElement(By.id("btnLogin")).click();
			driver.findElement(By.linkText("Recruitment")).click();
			driver.findElement(By.linkText("Candidates")).click();
			driver.findElement(By.id("candidateSearch_fromDate")).click();
		    Select mlist=new Select(driver.findElement(By.className("ui-datepicker-month")));
		    mlist.selectByVisibleText(month);
		    Select ylist=new Select(driver.findElement(By.className("ui-datepicker-year")));
		    ylist.selectByVisibleText(year);
		    WebElement cal;
		    cal=driver.findElement(By.className("ui-datepicker-calendar"));
		    List<WebElement> rows=cal.findElements(By.tagName("tr"));
		 
		    for (int i = 0; i <rows.size(); i++)
		    {
		    	List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
		    	for (int j = 1; j <cols.size(); j++) 
		    	{
		    		if (cols.get(j).getText().equals(dt))
		    		{
		    			cols.get(i).click();	    			
						
					}
					
				}
				
			}
		    
		    
	}	   
		    
	}				





