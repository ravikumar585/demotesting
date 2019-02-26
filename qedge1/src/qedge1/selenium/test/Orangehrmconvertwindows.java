package qedge1.selenium.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Orangehrmconvertwindows {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.get("http:\\orangehrm.qedgetech.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		//driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("firstName")).sendKeys("Ravi kumar");
		driver.findElement(By.id("lastName")).sendKeys("demo");
		driver.findElement(By.id("photofile"));
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\File Upload.exe");
		Thread.sleep(5000);
		driver.findElement(By.id("btnSave")).click();
		


	}

}
