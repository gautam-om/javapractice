package GroomingClass;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
	    WebDriver driver = new ChromeDriver();
	    driver.navigate().to("https://www.amazon.in/");
	       driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute'][@name='field-keywords']")).sendKeys("Redmi 9 pro");
	       driver.findElement(By.xpath("//input[@type='submit'][@tabindex='0']")).click();
	       driver.findElement(By.linkText("Redmi Note 9 Pro (Aurora Blue, 4GB RAM, 64GB Storage) - Latest 8nm Snapdragon 720G & Alexa Hands-Free")).click();
	       driver.findElement(By.xpath("//input[@type='submit'][@aria-labelledby='submit.buy-now-announce']")).submit();
					
	}

}
