package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.name("username")).sendKeys("john12415");
		driver.findElement(By.name("password")).sendKeys("jdfflwehgsv");
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.close();

	}

}
