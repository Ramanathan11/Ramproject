package org.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse oxy 32bit\\Frames\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.261886861.181523250.1578629173-416396066.1578629173");
		driver.switchTo().frame("login_page");
		WebElement s = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		s.sendKeys("Ram");
		WebElement t = driver.findElement(By.xpath("(//img[@alt='continue'])[1]"));
		t.click();
		
		WebElement u= driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		u.sendKeys("Ram");
		
		
		

	}

}
