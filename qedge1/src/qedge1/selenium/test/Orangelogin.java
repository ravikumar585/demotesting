package qedge1.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Orangelogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.get("http:\\orangehrm.qedgetech.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		

	}

}
