package assignments;

import static org.testng.Assert.assertTrue;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadless_Screenshot {

	public static WebDriver driver;
	//static WebDriverWait wait = new WebDriverWait(driver, 5);

	@BeforeClass
	public static void Setup() 
	{
		WebDriverManager.chromedriver().setup();
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			
		driver = new ChromeDriver(options); 
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Test
	public static void logoCheck()
	{
		//boolean logo = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@id='hplogo']"))).isDisplayed();
		boolean logo=driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		System.out.println("Inside logoCheck section");
		
		assertTrue(logo);
		//capture screenshot of google homepage
				File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				try {
					FileUtils.copyFile(file, new File("D:\\Headless\\headless_screenshot.png"));
				} catch (IOException e) {
					e.printStackTrace();
				}
	}
}