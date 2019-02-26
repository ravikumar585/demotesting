package qedge1.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiocountandprint {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("http:\\cleartrip.com");
		List<WebElement> radio=driver.findElements(By.xpath("//*[@type='radio']"));
		System.out.println(radio.size());
		for (int i = 0; i < radio.size(); i++)
		{
			System.out.println(radio.get(i).getAttribute("value"));			
		}
		
		
	}

}
