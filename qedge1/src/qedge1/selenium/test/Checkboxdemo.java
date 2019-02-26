package qedge1.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkboxdemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.get("https://globaltree.in/");
		WebElement div= driver.findElement(By.id("input_1_5"));
		List<WebElement> chks= driver.findElements(By.tagName("label"));
		System.out.println(chks.size());
		for (int i = 0; i < chks.size(); i++)
			
		{
			 System.out.println(chks.get(i).getText());
			 
			
		}
		
		
		//Thread.sleep(5000);
		//driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();

	}

}
