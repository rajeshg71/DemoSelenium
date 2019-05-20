import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleLogin {
	static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws InterruptedException {
		System.out.println("hi");
		//driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vicky\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		WebElement b=driver.findElement(By.xpath("//div[@id='divLogo']"));
		Assert.assertEquals(true, b.isDisplayed());
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.quit();
	}

}
