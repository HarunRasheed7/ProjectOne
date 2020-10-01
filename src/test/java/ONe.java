import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ONe {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace-new\\TestNG\\driver\\chromedriver84.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	    Actions acc=new Actions(driver);
	    acc.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"))).build().perform();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[contains(text(),'Bp Monitors')]")).click();
		List<WebElement> li = driver.findElements(By.xpath("//a[@class='_2cLu-l']"));
		for (WebElement x : li) {
			String text = x.getText();
			if (text.contains("AccuSure")) {
				System.out.println("yes");
				x.click();
			}
			
			
		}
		
	}

}
