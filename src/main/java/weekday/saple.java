package weekday;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class saple {
	@Test
	public void saples() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
    driver.get("http://leafground.com/pages/table.html");
	driver.manage().window().maximize();
	//Implicity changed
	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}

}
