package seleniumdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationDemoCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//a[@href='/register']")).click();
        Thread.sleep(3000);
       
        
        driver.navigate().back(); //home
        Thread.sleep(3000);
      
        
        driver.navigate().forward(); //register
        Thread.sleep(3000);
       
        
        driver.navigate().to("http://demowebshop.tricentis.com/"); //home
        Thread.sleep(3000);
       
        
        driver.navigate().refresh(); //browser
        Thread.sleep(3000);
        
        driver.close();

	}

}
