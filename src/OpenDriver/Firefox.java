package OpenDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "E:\\Automation Softwares\\Unzipped Files\\Drivers\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
	     driver.manage().window().maximize();
	     driver.get("http://www.gisbiz.com");

	}

	
}