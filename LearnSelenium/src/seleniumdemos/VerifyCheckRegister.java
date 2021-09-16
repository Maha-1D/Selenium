package seleniumdemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyCheckRegister {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='radiooptions' and @value='FeMale']")).click();
		
		//for year drop down
		
		WebElement year=driver.findElement(By.xpath("//*[@placeholder='Year']"));
		Select yr=new Select(year);
		List<WebElement>yearcount=yr.getOptions();
		System.out.println(yearcount.size());
		
		for(int i=0;i<yearcount.size();i++) {
			System.out.println(yearcount.get(i).getText());
			
		}
		
		//for month drop down
		
		WebElement month=driver.findElement(By.xpath("//*[@placeholder='Month']"));
		Select mon=new Select(month);
		List<WebElement>monthcount=mon.getOptions();
		System.out.println(monthcount.size());
		
		for(int j=0;j<monthcount.size();j++) {
			System.out.println(monthcount.get(j).getText());
		}
		
		//for day drop down
		
		WebElement day=driver.findElement(By.xpath("//*[@placeholder='Day']"));
		Select dy=new Select(day);
		List<WebElement>daycount=dy.getOptions();
		System.out.println(daycount.size());
		
		for(int k=0;k<daycount.size();k++) {
			System.out.println(daycount.get(k).getText());
		}
		
		yr.selectByIndex(5);
		mon.selectByVisibleText("February");
		dy.selectByValue("1");
	}
}
