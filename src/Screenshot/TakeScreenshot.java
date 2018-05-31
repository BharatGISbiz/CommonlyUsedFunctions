package Screenshot;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;


public class TakeScreenshot {
	public WebDriver driver;
	
	 @Test
     public void openBrowser() throws Exception {
     System.setProperty("webdriver.gecko.driver", "E:\\Automation Softwares\\Unzipped Files\\Drivers\\geckodriver-v0.19.1-win64\\geckodriver.exe");
     WebDriver driver = new FirefoxDriver();
   	  driver.manage().window().maximize();
   	  driver.get("http://www.google.com");
   	TakeScreenshot.captureScreenShot(driver);

}

public static void captureScreenShot(WebDriver ldriver){
//Take screenshot and store as a file format             
File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);           
try {
//now copy the  screenshot to desired location using copyFile method

	FileHandler.copy(src, new File("E:/"+System.currentTimeMillis()+".png"));                              } catch (IOException e)

{
System.out.println(e.getMessage()) ;
}
}
}