package JavaClassPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class javaClassThree {

	
	String myName = "Rana";
	
	WebDriver driver = new ChromeDriver();
	String URL = "https://www.saucedemo.com/";

	
	@BeforeTest
	
	public void myBefreTest()
	{
		
		driver.get(URL);
		driver.manage().window().maximize();
		
	}
	
	@Test
	
	public void myTest () throws InterruptedException
	{
		
		
		
		driver.get(URL);
		WebElement UserName = driver.findElement(By.id("user-name"));
		WebElement PasswordInputField = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.id("login-button"));
		
		
		
		UserName.sendKeys("standard_user");
		Thread.sleep(2000);
		PasswordInputField.sendKeys("secret_sauce");
		Thread.sleep(2000);
		LoginButton.click();
		
		List<WebElement> addToCartButon = driver.findElements(By.className("btn"));
		
		for (int i=0 ; i<addToCartButon.size(); i++)
			
			addToCartButon.get(i).click();

			
		}
		
	
	
}
