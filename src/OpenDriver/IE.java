package OpenDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.ie.driver", "E:\\Automation Softwares\\Unzipped Files\\Drivers\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
		 WebDriver driver = new InternetExplorerDriver();
	     driver.manage().window().maximize();
	     driver.get("http://www.gisbiz.com");

	}

	
}
