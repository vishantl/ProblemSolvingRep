package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetLinksforW2A {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Way2Autoamation");
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]")).click();
		
		driver.findElement(By.xpath("//*[@id='taw']/div[2]/div/p/a/b/i")).click();
		driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div[1]/a/h3/span")).click();
		WebElement resource = driver.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[8]/a"));
		
		Actions action = new Actions(driver);
		action.moveToElement(resource).perform();
		
		driver.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[8]/ul/li[2]/a")).click();
		
		//This is for handling dropdown options
		WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='load_form']/fieldset[4]/select")));
		
		Select select = new Select(dropdown);
		List<WebElement> AllLinks = select.getOptions();
		
		System.out.println(AllLinks.get(5).getAttribute("value"));
		select.selectByVisibleText("Jamaica");
		
		
		driver.findElement(By.xpath("(//*[@id='load_form']/fieldset[1]/input)[2]")).sendKeys("Vishant");
		driver.findElement(By.xpath("(//*[@id='load_form']/fieldset[2]/input)[2]")).sendKeys(String.valueOf((Math.random()*1000)));
		driver.findElement(By.xpath("//*[@id='load_form']/fieldset[3]/input")).sendKeys("addsagf@fagklh.com");
		driver.findElement(By.xpath("//*[@id='load_form']/fieldset[5]/input")).sendKeys("Pune");
		driver.findElement(By.xpath("//*[@id='load_form']/fieldset[6]/input")).sendKeys("vaihfo");
		driver.findElement(By.xpath("//*[@id='load_form']/fieldset[7]/input")).sendKeys("ewgeewg");
		driver.findElement(By.xpath("(//*[@id='load_form']/div/div[2]/input)[2]")).click();
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int totalLinks = links.size();
		System.out.println(totalLinks);
		for (WebElement link: links) {
			
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
			
		}
				
		//driver.quit();
		
	}

}
