package testbdidu;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testbaidu {
	WebDriver driver;
	String url="http://baidu.com";
	@BeforeClass
	public void openbrowser() throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		driver =new ChromeDriver();
	}
	@Test
	public void login() {
		driver.get(url);
		driver.findElement(By.id("kw")).sendKeys("sdsds");;  //’“µΩ ‰»ÎøÚ
		driver.findElement(By.id("su")).click();
	}
	   
}
