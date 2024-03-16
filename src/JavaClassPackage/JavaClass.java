package JavaClassPackage;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaClass {

	String myWebSite = "https://smartbuy-me.com/smartbuystore/en/login";
	String myMobile = "798284333" ;
	
	String myURL = "https://www.google.com";
	int SSS =123 ;
	int rrr = -2;
	double myhighest = 162.5;
	int myAge = 28;
	WebDriver driver = new ChromeDriver();
	@BeforeTest

	public void myBeforeTest()

	{

		// String myName = "abedalraheem";
		// System.out.println(myName.charAt(0));
		// System.out.println(myName.toUpperCase());
		// System.out.println(myName.toUpperCase().charAt(0));

		// System.out.println(myName.replace("a", "m"));
		// System.out.println(myName.contains("Z"));
		// System.out.println(myName.contains("a"));
		// System.out.println(myName.contains("A"));
		// System.out.println(myName.contains("eem"));
		// System.out.println(myName.endsWith("zo"));
		// System.out.println(myName.endsWith("abedalraheem"));
		// System.out.println(myName.endsWith("bedalraheem"));

		
		//driver.manage().window().maximize();
	}

	@Test (invocationCount = 8)
	public void myTest() throws InterruptedException
	

	{
		//driver.get(myMobile);
		//driver.get(myURL.toUpperCase());
		//driver.get(myWebSite);
		// WebElement mobileNumberInput= driver.findElement(By.id("mobileNumber"));
		// mobileNumberInput.sendKeys(myMobile);
		
		
		
	//	System.out.println(Math.pow(SSS, 123));
		//System.out.println(Math.abs(rrr));

		
//		String myFirstName = "rana";
//		String myLasttName = "asfour";
//		String domain = "@gmail.com";
//		Random rand = new Random();
//		int randomId = rand.nextInt(10);

		
//System.out.println(myFirstName.concat(myLasttName)+randomId+domain);	
		
//		driver.get(myWebSite);
//		Thread.sleep(2000);
//		driver.findElement(By.id("register.email")).sendKeys(myFirstName.concat(myLasttName)+randomId+domain);
		
		
	
				 
	}

}
