package qedge1.selenium.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowsmutiplebrowses {
	public static void main(String[] args) throws InterruptedException {

	
	
	
	System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
	WebDriver driver =new FirefoxDriver();
	driver.get("http:\\gmail.com/");
	String currwindowid= driver.getWindowHandle();
	System.out.println(currwindowid);
	driver.findElement(By.linkText("Help")).click();
	System.out.println(driver.getWindowHandle());
	Set<String> allwindowsid=driver.getWindowHandles();
	System.out.println(allwindowsid);
	
	Object[] windows=allwindowsid.toArray();
	String window1=windows[0].toString();
	String window2=windows[1].toString();
	//Thread.sleep(5000);
		
	driver.switchTo().window(window2);
	//driver.findElement(By.className("parent selected"));
	//driver.findElement(By.className("children"));
	//driver.findElement(By.xpath("//section[1]/div/div/div[1]/a")).click();
	driver.findElement(By.linkText("Create a Google Account")).click();
	
	driver.switchTo().window(window1);
	System.out.println(driver.getTitle());
	

}
}
