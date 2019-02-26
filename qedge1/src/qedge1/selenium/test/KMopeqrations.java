package qedge1.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KMopeqrations {

	public static void main(String[] args) throws InterruptedException {
      
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.get("http:\\snapdeal.com/");
		Actions   act= new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[1]/div[2]/ul/li[2]/a/span[2]")));
		act.build().perform();
		
		act.contextClick(driver.findElement(By.linkText("Smartphones")));
		
		act.build().perform();
	
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER);
		act.build().perform();
		
	}

}
