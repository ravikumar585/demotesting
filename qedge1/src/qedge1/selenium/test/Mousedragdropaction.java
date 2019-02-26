package qedge1.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousedragdropaction {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.get("http:\\jqueryui.com/");
		
		driver.findElement(By.linkText("Droppable")).click();
		Thread.sleep(5000);
		WebElement srcelement,trgelement;
		driver.findElement(By.id("main"));
		driver.findElement(By.id("menu-top"));
		driver.findElement(By.className("menu-item"));
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		srcelement=driver.findElement(By.id("draggable"));
		trgelement=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(srcelement, trgelement);
		act.build().perform();
	
	}

}
