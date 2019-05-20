package com.qa.examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {
	static WebDriver driver;
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vicky\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//table[@id='customers']/tbody/tr[2]/td[1]
		//table[@id='customers']/tbody/tr[3]/td[1]
		//table[@id='customers']/tbody/tr[2]/td[1]
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowCount = rows.size();
		System.out.println("Rows count is"+rowCount);
		String before_path = "//table[@id='customers']/tbody/tr[";
		String after_xpath = "]/td[1]";
		for(int i=2;i<=rowCount;i++) {
			String name = driver.findElement(By.xpath(before_path+i+after_xpath)).getText();
			System.out.println(name);
		}
		
		System.out.println("*********");
		String before_path2 = "//table[@id='customers']/tbody/tr[";
		String after_xpath2 = "]/td[2]";
		for(int i=2;i<=rowCount;i++) {
			String name = driver.findElement(By.xpath(before_path2+i+after_xpath2)).getText();
			System.out.println(name);
		}
		System.out.println("*********");
		String before_path3 = "//table[@id='customers']/tbody/tr[";
		String after_xpath3 = "]/td[3]";
		for(int i=2;i<=rowCount;i++) {
			String name = driver.findElement(By.xpath(before_path3+i+after_xpath3)).getText();
			System.out.println(name);
		}
		System.out.println("*********");
		//table[@id='customers']/tbody/tr[1]/th[1]
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		int colCount = cols.size();
		System.out.println("Columns count is"+colCount);
		String before = "//table[@id='customers']/tbody/tr[1]/th[";
		String after = "]";
		for(int j=1;j<=colCount;j++) {
			String nae = driver.findElement(By.xpath(before+j+after)).getText();
			System.out.println(nae);
		}
		driver.quit();
	}

}
