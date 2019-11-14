package com.piit.session.amazon;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.rmi.server.UID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;

  @Test
  public void f() throws InterruptedException {
	  Home ui=new Home(driver);
	  ui.homevalueinput("800000");
	  Thread.sleep(3000); 
	  ui.downpaymentinput("80000");
	  Thread.sleep(3000);
	  ui.intrstsrateinput("28.0");
	  Thread.sleep(3000);
	  ui.buttonclinput();
	  System.out.println("This to change com ");
  }
  
  @BeforeClass
 // @Parameters("browser")
  public void beforeClass() {
	 /* if(browsers.equalsIgnoreCase("chrome")) {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Automation_aps_code\\src\\Drivers\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new WebDriver;
	  driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		 driver.navigate().to("https://www.mortgagecalculator.org");
	  }else if (browsers.equalsIgnoreCase("firefox")){
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\eclipse-workspace\\Automation_aps_code\\src\\Drivers\\chromedriver_win32\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		 driver.navigate().to("https://www.mortgagecalculator.org");
  } else 
	System.out.println("Correct to digits");
	  }*/
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Automation_aps_code\\src\\Drivers\\chromedriver_win32\\chromedriver.exe");
	
	  driver = new ChromeDriver();
	  driver.navigate().to("https://www.mortgagecalculator.org");
  }
  @AfterClass
  public void afterClass() {
  }

}
