package seleniumdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyRegister {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@value='F']")).click();
		driver.findElement(By.name("FirstName")).sendKeys("sai");
		driver.findElement(By.name("LastName")).sendKeys("k");
		driver.findElement(By.id("Email")).sendKeys("saikalla@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("saik1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("saik1234");
		
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.close();
		


	}

}
