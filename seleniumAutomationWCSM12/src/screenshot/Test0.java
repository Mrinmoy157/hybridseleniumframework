package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Step 1: Typecasting
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		//Step2: Access the method and photo will be stored
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//Step3: Specify the path to store the photo
		File dest= new File("./photo/amazon.png");
		
		//Step4: Copy the photo from RAM to required location
		FileUtils.copyFile(src, dest);
		
		driver.close();

	}

}
