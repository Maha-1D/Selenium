package seleniumdemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//get page name
		String title=driver.getTitle();
		System.out.println(title);
		
		//get title length
		String lengthtitle=driver.getTitle();
		System.out.println("Title length is " +lengthtitle.length());
		
		//get page URL 
		String url=driver.getCurrentUrl();
		//System.out.println(url);
		
		//verify the url is correct or not
		
		if(url.equals("http://demowebshop.tricentis.com/")){
			System.out.println("Correct Url");		
		}
		else {
			System.out.println("Wrong Url");
		}
		
		//get page source
		String pagesource=driver.getPageSource();
		int pagelength=pagesource.length();
		
		System.out.println("page source length " +pagelength);
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
