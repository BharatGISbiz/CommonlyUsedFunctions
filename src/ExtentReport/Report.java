
package ExtentReport;
 
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
 


import java.io.File;
import java.io.IOException;



import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
public class Report {
	
ExtentReports report;
 ExtentTest test;
  WebDriver driver;
      //pass scenario
@Test(priority = 1, enabled = true)
public void verifyHomePageTitle() {
report = new ExtentReports(
"E:\\Automation Softwares\\ExtentReports\\automationreport.html", true);
report.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
 test = report.startTest("Verify application Title");
 System.setProperty("webdriver.gecko.driver", "E:\\Automation Softwares\\Unzipped Files\\Drivers\\geckodriver-v0.19.1-win64\\geckodriver.exe");
 WebDriver driver = new FirefoxDriver();
 driver.manage().window().maximize();
 test.log(LogStatus.INFO, "Browser started");
  driver.get("https://www.built.io/");
String title = driver.getTitle();
System.out.println(title);
if (title.equals("Built.io – Build mobile apps fast, Connect your digital business, Deliver content everywhere")) {
test.log(LogStatus.PASS, "verify Title of the page");
} else {
test.log(LogStatus.FAIL, "verify Title of the page");
 }
report.endTest(test);
report.flush();
            }
     //Fail  scenario
       @Test(priority = 2, enabled = true)
       public void verifyLogo() throws IOException {
              test = report.startTest("Verify logo of the application");
              String src = driver.findElement(By.xpath("//img[@class='img']"))
                           .getAttribute("src");
              if (src.equals("")) {
                     test.log(LogStatus.PASS, "verify logo");
              } else {
                     test.log(LogStatus.FAIL, "verify logo");
                     File scrFile = ((TakesScreenshot) driver)
                                  .getScreenshotAs(OutputType.FILE);
                     FileHandler.copy(scrFile, new
     File("E:\\Automation Softwares\\Screenshots\\img.jpg"));
                     String image= test.addScreenCapture("E:\\Automation Softwares\\Screenshots\\img.jpg");
                     test.log(LogStatus.FAIL, "verify logo of  the application", image);
              }
              report.endTest(test);
              report.flush();
              driver.quit();
       }
}