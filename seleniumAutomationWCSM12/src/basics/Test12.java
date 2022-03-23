package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("qwe@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234565");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();

	}

}
