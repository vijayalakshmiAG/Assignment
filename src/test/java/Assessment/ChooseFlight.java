package Assessment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElement;

public class ChooseFlight {
	
public WebDriver driver;
	
	public ChooseFlight(WebDriver driver) {
		super();
		this.driver=driver;
	}
	
	By BChooseFilght= By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input");
	
	public WebElement ChooseFilght() {
		return driver.findElement(BChooseFilght);
		
	}
	

}
