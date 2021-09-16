package seleniumdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionDemo {
	WebDriver driver;
	
	@BeforeMethod
	@Test
	public void setbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("Start google application");
	}
	
	@Test
	public void checkurl() {
		String googletitle=driver.getTitle();
		System.out.println(googletitle);
		Assert.assertEquals(googletitle, "google");
	}
	
	@Test(priority=1)
	public void checklogo() {
		boolean view=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		Assert.assertTrue(view);
	}
	
	@AfterMethod
	public void closebrowser() {
		driver.close();
	}
}
