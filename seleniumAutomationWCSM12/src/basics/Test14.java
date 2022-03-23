package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test14 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("mrin@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("asdfghjjkk");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();

	}

}
