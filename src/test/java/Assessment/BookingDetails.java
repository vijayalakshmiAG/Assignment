package Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookingDetails {
	
public WebDriver driver;
	
	public BookingDetails(WebDriver driver) {
		super();
		this.driver=driver;
	}
	
	By vName= By.id("inputName");
	By vCard= By.xpath("//*[@id=\"creditCardNumber\"]");
	By vCardName= By.id("nameOnCard");
	By vSave= By.id("rememberMe");
	By vPurchase=By.xpath("/html/body/div[2]/form/div[11]/div/input");
	
	public WebElement Name() {
		return driver.findElement(vName);
	}
	public WebElement CardNumber() {
		return driver.findElement(vCard); 
	}
	public WebElement NameOnCard() {
		return driver.findElement(vCardName);
	}
	public WebElement SaveDetails() {
		return driver.findElement(vSave);
	}
	public WebElement ClickOnPurchase() {
		return driver.findElement(vPurchase);
	}	

}
