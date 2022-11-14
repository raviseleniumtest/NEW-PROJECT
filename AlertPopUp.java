package orangeHrmRegestrition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUp {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
	
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		alert.accept();
		

	}

}
