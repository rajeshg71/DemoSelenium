package com.orange.performance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class PerformanceTest {
	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
		System.out.println("hi");
		//driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vicky\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		boolean b=driver.findElement(By.xpath("//div[@id='divLogo']")).isDisplayed();
		System.out.println(b);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement e = driver.findElement(By.xpath("//li//a[@id='menu__Performance']//b"));
		Actions action = new Actions(driver);
		action.moveToElement(e).build().perform();
		WebElement e1 = driver.findElement(By.xpath("//a[text()='Configure' and @id='menu_performance_Configure']"));
		action.moveToElement(e1).build().perform();
		WebElement e2 = driver.findElement(By.xpath("//a[text()='Trackers']"));
		action.moveToElement(e2).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
	}


}
