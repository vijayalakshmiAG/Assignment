package Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrintDetails {
public WebDriver driver;
	
	public PrintDetails(WebDriver driver) {
		super();
		this.driver=driver;
	}
	By vAmount=By.xpath("/html/body/div[2]/div/table/tbody/tr[3]/td[2]");
	By vCardNumber=By.xpath("/html/body/div[2]/div/table/tbody/tr[4]/td[2]");
	By vExpiration=By.xpath("/html/body/div[2]/div/table/tbody/tr[5]/td[2]");
	
	public WebElement Amount() {
		return driver.findElement(vAmount);
	}
	public WebElement PrintCardNumber() {
		return driver.findElement(vCardNumber);
	}
	public WebElement Expiration() {
		return driver.findElement(vExpiration);
	}

}
