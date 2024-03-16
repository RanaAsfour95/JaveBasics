package JavaClassPackage;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class javaClass2 {
	
	 double myhighest = 162.5;
	 int myAge = 28;
	 
	 WebDriver driver = new ChromeDriver();
	 
	 
	@BeforeTest
	
	public void myBeforeTest()
	{}
	
	
	@Test 
	
	public void myTest () throws InterruptedException
	
	{
		
//	driver.get("https://www.google.com");
//		String newVariavle=	Double.toString(myhighest);
//		String newVariable2 = Integer.toString(myAge);
//		
//		driver.findElement(By.id("APjFqb")).sendKeys(newVariavle);
//		driver.findElement(By.id("APjFqb")).sendKeys(newVariable2);
		
		driver.get("https://www.saucedemo.com");
		WebElement UserName = driver.findElement(By.id("user-name"));
		WebElement PasswordInputField = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.id("login-button"));
		
		
		
		UserName.sendKeys("standard_user");
		Thread.sleep(2000);
		PasswordInputField.sendKeys("secret_sauce");
		Thread.sleep(2000);

		LoginButton.click();
		Thread.sleep(2000);


	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
