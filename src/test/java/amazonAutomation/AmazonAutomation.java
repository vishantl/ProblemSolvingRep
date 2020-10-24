package amazonAutomation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAutomation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.findElement(By.cssSelector(".a-size-base.a-link-normal")).click();
		
		// -- Code for getting WindowHandles and Switch to required window. 
		Set<String> Amazon = driver.getWindowHandles();
		Iterator<String> iterator = Amazon.iterator();
		String AmazonDotCom = iterator.next();
		
		System.out.println(AmazonDotCom);
		System.out.println(driver.getTitle());
		
		
		String AmazonDotIn = iterator.next();
		driver.switchTo().window(AmazonDotIn);
		System.out.println(driver.getTitle());
		// -- Code for getting WindowHandles and Switch to required window. 
		
		
		//Code for clicking on element on Second window
		WebElement img1 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div#desktop-grid-2>div>div.a-cardui-body>a>div")));
		Actions action1 = new Actions(driver);							
		action1.moveToElement(img1);
		action1.click().perform();
		
		
		
		//driver.findElement(By.cssSelector("div#desktop-grid-2>div>div.a-cardui-body>a>div > img.landscape-image")).click();
		
		//Switch back to first i.e. default window
		driver.switchTo().window(AmazonDotCom);
		System.out.println(AmazonDotCom);
		WebElement img = driver.findElement(By.cssSelector("div#desktop-grid-7>div>div.a-cardui-body>a>div"));
		
		Actions action = new Actions(driver); 
		action.moveToElement(img);
		action.click().perform();
		
		
		
		//WebElement img = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#Gc5hjg9i1ICohC-kK_5GyA > div.a-cardui-body > a > div > img")));
		//driver.findElement(By.xpath("//*[@id='nOwp15MdA-_73aa4l-8BeQ']/div[2]/a/div/img")).click();
		//img.click();
		driver.quit();
		
	}
}
