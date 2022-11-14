package orangeHrmRegestrition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Case {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get( "https://www.orangehrm.com/");
		
		driver.findElement(By.linkText("Book a Free Demo")).click();
        driver.findElement(By.id("Form_getForm_FullName")).sendKeys("Ravi Kusugal");	
        driver.findElement(By.id("Form_getForm_Email")).sendKeys("kusugalravi@gmail.com");
        driver.findElement(By.name("Contact")).sendKeys("6361291861");
	}

}
	