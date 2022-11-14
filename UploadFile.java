package orangeHrmRegestrition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/upload/");
		
		WebElement fileUpload = driver.findElement(By.cssSelector("#uploadfile_0"));
		
		fileUpload.sendKeys("F:\\RaviFile.png");
		driver.findElement(By.cssSelector("#terms")).click();
	}

}
