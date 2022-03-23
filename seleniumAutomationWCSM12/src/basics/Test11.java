package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/");
		driver.findElement(By.xpath("(//div[@dir='auto'])[8]")).click();
		driver.findElement(By.name("text")).sendKeys("6294929801");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.name("password")).sendKeys("twtefdsvcx");
		driver.findElement(By.xpath(" //span[contains(text(),'Log in')]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();

	}

}
