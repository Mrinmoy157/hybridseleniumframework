package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("core java for selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		driver.findElement(By.xpath("(//img[@class='thumb lazy'])[2]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@aria-label='Pause']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[text()='Add To Wishlist']"));
		Thread.sleep(2000);
		driver.close();

	}

}
