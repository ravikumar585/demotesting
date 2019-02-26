package qedge1.selenium.test;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectcar {


	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C://Users//Lenovo//Downloads//geckodriver-v0.21.0-win64//geckodriver.exe") ;
		WebDriver driver =new FirefoxDriver();
		driver.get("http://facebook.com");
		WebElement  deleme=driver.findElement(By.id("day"));
		Select daye= new Select(deleme);
		WebElement melement= driver.findElement(By.id("month"));
		Select sel= new Select(melement);
	Select  lselect =new Select(driver.findElement(By.id("year")));
		
		//daye.selectByIndex(4);
		lselect.selectByVisibleText("2012");
		sel.selectByValue("4");
		sel.deselectAll();
		daye.deselectByIndex(2);
	
}
	
}


