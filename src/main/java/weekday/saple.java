package weekday;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class saple {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
    driver.get("http://leafground.com/pages/table.html");
	driver.manage().window().maximize();
	//Implicity changed
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

}
