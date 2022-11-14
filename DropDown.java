package orangeHrmRegestrition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get( "https://www.orangehrm.com/");
		driver.findElement(By.linkText("Book a Free Demo")).click();

		
     WebElement Country = driver.findElement(By.id("Form_getForm_Country"));

     Select dropDownCountry = new Select (Country);
      // dropDownCountry.selectByIndex(2);
    // dropDownCountry.selectByValue("Brazil");
     dropDownCountry.selectByVisibleText("Pakistan");
     
	}

}
