package orangeHrmRegestrition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWebMath {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get( "http://www.webmath.com/");
		
		WebElement general_math_link =driver.findElement(By.linkText("General Math"));	
		
		Select drop_down = new Select(driver.findElement(By.cssSelector("select][id *= 'topicItem']")));
		drop_down.selectByVisibleText("Interest,Simple");
		
		driver.findElement(By.name("principal")).sendKeys("10000");
		driver.findElement(By.className("interest")).sendKeys("10");
		driver.findElement(By.className("desired_time")).sendKeys("1");
		WebElement f = driver.findElement(By.cssSelector("input[value= 'Find the amount of interest']"));
		f.click();
		Thread.sleep(5000);
		driver.close();
		
	}

}
