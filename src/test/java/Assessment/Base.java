package Assessment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {

	public Properties properties;
	public FileInputStream fis;
	public String vBrowser;
	public WebDriver driver;

	
	public void BrowserCall() throws IOException
	{
		properties=new Properties();
		fis=new FileInputStream("D:\\selenium\\Testing1\\Assessment\\data.properties");	
		properties.load(fis);
		vBrowser=properties.getProperty("Browser");
		
		if(vBrowser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Automation\\Chrome\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (vBrowser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver","C:\\Automation\\Edge\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Invalid Browser");
		}
	}

}
