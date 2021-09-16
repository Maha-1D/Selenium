package seleniumdemos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		//Alert with ok
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Alert alert=driver.switchTo().alert();
		
		String alertmessage=driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		alert.accept();
		
		Thread.sleep(3000);
		
		//Alert with ok and Cancel
		driver.findElement(By.xpath("//*[@href='#CancelTab']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Alert alert1=driver.switchTo().alert();
		
		String alertokmessage=driver.switchTo().alert().getText();
		System.out.println(alertokmessage);
		alert1.dismiss();
		
		Thread.sleep(3000);
		
		//Alert with Text box
		
		driver.findElement(By.xpath("//*[@href='#Textbox']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		Alert alert2=driver.switchTo().alert();
		
		String alerttextmessage=driver.switchTo().alert().getText();
		System.out.println(alerttextmessage);
		alert2.sendKeys("test");
		alert2.accept();
		
		Thread.sleep(3000);
		
		
		
		
		
		
		

	}

}
