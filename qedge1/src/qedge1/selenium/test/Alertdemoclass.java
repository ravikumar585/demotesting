package qedge1.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertdemoclass {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.get("http:\\orangehrm.qedgetech.com/");
		//driver.findElement(By.id("txtuId")).sendKeys("Admin");
		//driver.findElement(By.id("txtPword")).sendKeys("ravi");
		//driver.findElement(By.id("login")).click();;
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("ravi");
		driver.findElement(By.id("btnLogin")).click();
		String alertmsg=driver.switchTo().alert().getText();
		System.out.println(alertmsg);
		driver.switchTo().alert().accept();
		

	}

}
