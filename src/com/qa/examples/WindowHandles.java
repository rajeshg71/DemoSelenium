package com.qa.examples;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
		System.out.println("hi");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vicky\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com/");
		String parent = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> I1= s1.iterator();
		while(I1.hasNext()) {
			String child = I1.next();
			if(!parent.equals(child)) {
				driver.switchTo().window(child);
				System.out.println(driver.switchTo().window(child).getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		driver.quit();
}
}