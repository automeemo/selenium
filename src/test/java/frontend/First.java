package frontend;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class First {
	
	@Test
	public void raf() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "/Users/Master/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://gmail.com");
		driver.findElement(By.name("identifier")).sendKeys("vertasqa@gmail.com");
		driver.findElement(By.name("identifier")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".Xb9hP>.whsOnd")).sendKeys("Dukenukem21");
		driver.findElement(By.cssSelector(".Xb9hP>.whsOnd")).sendKeys(Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".z0>.T-I")));
		driver.findElement(By.cssSelector(".z0>.T-I")).click();
		driver.findElement(By.cssSelector(".vO[name=to]")).sendKeys("vertasqa@gmail.com");
		driver.findElement(By.cssSelector(".aoT[name=subjectbox]")).sendKeys("Hello subject");
		driver.findElement(By.className("Am")).sendKeys("Good evening! Let's go to sleep");
		String cmdEnter = Keys.chord(Keys.COMMAND, Keys.ENTER);
		driver.findElement(By.className("Am")).sendKeys(cmdEnter);
	}
	
}
