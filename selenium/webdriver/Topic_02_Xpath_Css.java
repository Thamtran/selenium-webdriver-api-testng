package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Topic_02_Xpath_Css {

	WebDriver driver;
	@Test
	public void TC_O1()
	// Mở trình duyệt bằng Firefox
	
	{ driver = new FirefoxDriver();
	 // 2. Đăng nhập vào Facebook
	driver.get("https://www.facebook.com/");
	// 3. nhập email textbox
	// Action: Nhập/ hover/drag drop/get text/..
	driver.findElement(By.id("email")).sendKeys("tham0906@gmail.com");
	driver.findElement(By.id("email")).clear();
	//css
	driver.findElement(By.cssSelector("#email")).sendKeys("thamtth90@gmail.com");
	driver.findElement(By.cssSelector("input[id='email']")).clear();
	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("thamtran@gmail.com");
	driver.findElement(By.cssSelector("input[id='email']")).clear();
 // xpath
	driver.findElement(By.xpath("//[@id='email']")).sendKeys("minhanh@gmail.com");
	driver.findElement(By.xpath("//[@id='pass']")).sendKeys("1234567");
	driver.findElement(By.xpath("//[@id='pass']")).clear();


	}
	
	
}
