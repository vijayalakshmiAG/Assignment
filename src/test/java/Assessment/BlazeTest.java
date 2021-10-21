package Assessment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class BlazeTest extends Base{
	
	@Test
	public void TS001() throws IOException, InterruptedException {
		
		//BrowserCall()
		BrowserCall();
		driver.get(properties.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Call Page Object Class - HomePage
		if(driver.getTitle().contains("BlazeDemo")) {
		HomePage hp=new HomePage(driver);
		hp.SelectDeparture("Boston");
		Thread.sleep(1000);
		hp.SelectDestination("New York");
		Thread.sleep(1000);
		hp.OnClickFlight().click();
		}
		
		//Call Page Object Class - ChooseFilght
		if(driver.getTitle().contains("BlazeDemo - reserve")) {
		ChooseFlight cf=new ChooseFlight(driver);
		cf.ChooseFilght().click();
		}
		
		//Call Page Object Class - BookingDetails
		if(driver.getTitle().contains("BlazeDemo Purchase")) {
		BookingDetails b=new BookingDetails(driver);
		b.Name().sendKeys("Vijayalakshmi");
		Thread.sleep(4000);
		b.CardNumber().sendKeys("97866664544");
		Thread.sleep(4000);
		b.NameOnCard().sendKeys("Vijayalakshmi B");
		Thread.sleep(4000);
		b.SaveDetails().click();
		Thread.sleep(4000);
		b.ClickOnPurchase().click();
		Thread.sleep(4000);
		}
		
		//Call Page Object Class - PrintDetails
		if(driver.getTitle().contains("BlazeDemo Confirmation")) {
		PrintDetails details=new PrintDetails(driver);
		System.out.println("Amount=" +details.Amount().getText());
		System.out.println("CardNumber=" +details.PrintCardNumber().getText());
		System.out.println("Expiration=" +details.Expiration().getText());
		driver.close();
		}
		
	}

}
