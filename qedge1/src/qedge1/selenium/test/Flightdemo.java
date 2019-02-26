package qedge1.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Flightdemo {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.get("http://spicejet.com");
		WebElement felement=driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		Select flist=new Select(felement);
		flist.selectByValue("IXB");
		
		
		

	} 

}
