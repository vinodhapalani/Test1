package test.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniunm {
	
	public static  void main(String args[])
	{
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinod\\Desktop\\C\\Users\\vinod\\eclipse-workspace\\Test1\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(51, TimeUnit.MINUTES);
		
		WebElement Search =driver.findElement(By.id("searchDropdownBox"));
	    Search.sendKeys("Wrist Watches");
	    
	    WebElement  Display= driver.findElement(By.name("WristWatches"));
	    Display.sendKeys("Analogue");
	    
	    WebElement Analogue=driver.findElement(By.name("BrandMaterials"));
	    Analogue.sendKeys("Leather");
	    
	    WebElement Leather=driver.findElement(By.name("Brand"));
	    Leather.sendKeys("Titan");
	    
	    WebElement titan =driver.findElement(By.name("Discount"));
	    titan.sendKeys("25% Off or more");
	    
	    WebElement Discount= driver.findElement(By.className(" Fifth Element from the search"));
	    Discount.sendKeys(" Fifth Element from the search");
	    
	    WebElement  FifthElement=driver.findElement(By.name("Submit"));
	    FifthElement.submit();
}

}
