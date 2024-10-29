package Cygnet.UKMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstTest {
	
	public static void main (String[] args) throws InterruptedException {
	
	//WebDriver driver= new FirefoxDriver();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(20000);
	System.out.println("Browser opened and closed after 20 seconds.");
	driver.close();
	
	}
}
