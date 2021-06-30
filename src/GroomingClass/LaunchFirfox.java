package GroomingClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirfox {

	public static void main(String[] args)
	{
       System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
       WebDriver driver = new FirefoxDriver();
       driver.navigate().to("https://www.amazon.in/");
       driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute'][@name='field-keywords']")).sendKeys("Redmi 9 pro");
       driver.findElement(By.xpath("//input[@type='submit'][@tabindex='0']")).click();
       driver.findElement(By.linkText("Redmi Note 9 Pro (Aurora Blue, 4GB RAM, 64GB Storage) - Latest 8nm Snapdragon 720G & Alexa Hands-Free")).click();
       driver.findElement(By.xpath("//input[@type='submit'][@aria-labelledby='submit.buy-now-announce']")).submit();
       driver.close();
	}

}
