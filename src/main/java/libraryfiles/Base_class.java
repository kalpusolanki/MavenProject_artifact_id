package libraryfiles;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class 
{
	WebDriver driver;
public void Initializebrowser() throws IOException 
{
	driver=new ChromeDriver();
	driver.get(Utility_Class.PFTestData("URL"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
}
