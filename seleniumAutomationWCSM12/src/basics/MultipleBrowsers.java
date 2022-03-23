package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowsers {
public static void testBrowser(WebDriver driver)
{
	driver.get("http://www.facebook.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.close();
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		MultipleBrowsers.testBrowser(driver);
		MultipleBrowsers.testBrowser(new FirefoxDriver());

	}

}
