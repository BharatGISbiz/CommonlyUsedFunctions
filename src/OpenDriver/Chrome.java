package OpenDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chrome {

public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "E:\\Automation Softwares\\Unzipped Files\\Drivers\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("http://www.gisbiz.com");

}

}