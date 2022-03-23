package implicitAndExplicitWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri {

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
		if(title.equals("Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();

	}

}
