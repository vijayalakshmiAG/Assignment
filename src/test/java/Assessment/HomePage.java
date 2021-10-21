package Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super();
		this.driver=driver;
	}
	
	By BSelectDeparture=By.xpath("//select[@name='fromPort']");
	By BSelectDestination=By.xpath("//select[@name='toPort']");
	By OnClickFlight=By.xpath("/html/body/div[3]/form/div/input");

	
	public void SelectDeparture(String Fcity) {
		Select city=new Select(driver.findElement(BSelectDeparture));
		city.selectByValue(Fcity);
	}
	public void SelectDestination(String Fdest) {
		Select dest=new Select(driver.findElement(BSelectDestination));
		dest.selectByValue(Fdest);
	}
	public WebElement OnClickFlight() {
		return driver.findElement(OnClickFlight);
	}

}
