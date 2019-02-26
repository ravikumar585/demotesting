package qedge1.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookprinter {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.get("http://facebook.com");
		WebElement melement= driver.findElement(By.id("month"));
		Select mlist= new Select(melement);
		List<WebElement> months=mlist.getOptions();
		System.out.println(months.size());
		for (int i = 0; i < months.size(); i++) 
		{
			String mname= months.get(i).getText();
			System.out.println(mname);
			
		}


	}

}
