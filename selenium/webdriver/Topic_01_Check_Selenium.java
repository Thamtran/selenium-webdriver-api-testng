package webdriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_01_Check_Selenium {
    // Khai báo biến 
	WebDriver driver;
	
	// Pre-Condition
	@BeforeClass
	public void beforeClass() {
		// Mở browser
		driver = new FirefoxDriver();
		
		// Mở app cần test
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void TC_01_Check_Title() {
		String homePageTitle = driver.getTitle();
		
		Assert.assertEquals(homePageTitle, "Facebook - Ðăng nhập hoặc đăng ký");
	}

	@Test
	public void TC_02_Check_Url() {
		String homePageUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(homePageUrl, "https://www.facebook.com/");
	}

	// Post-Condition
	@AfterClass
	public void afterClass() {
		// đóng trình duyệt
		driver.quit();
	}

}