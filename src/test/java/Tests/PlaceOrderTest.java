package Tests;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import Pages.LoginPage;
import Pages.ProductPage;
import utils.Base;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;




public class PlaceOrderTest  extends Base{
	ExtentSparkReporter spark;
	ExtentReports extReports;
	ExtentTest test;
	
	@BeforeClass
	public void setUpReports() {
		spark = new ExtentSparkReporter("reports\\ExtentReport.html");
		extReports = new ExtentReports();
		extReports.attachReporter(spark);
	}

	@AfterClass
	public void writeReports() {
		extReports.flush();
	}
	
  @Test
  public void testPlaceOrder() {
	  
	  
	  //1. perform login operation and validate
	  test = extReports.createTest("Place Order");
	  
	  LoginPage loginPage = new LoginPage(driver, test);
	  loginPage.validateLogin("standard_user", "secret_sauce");
	  
	  //2. click on the product adna validate
	  
	  
	  ProductPage productPage = new ProductPage(driver, test);
	   productPage.clickOnFirstProduct();
	  //3. click add to cart button and validate
	  
	  //4. click on cart button and validate
	  //5. click on chekc button
	  //6. enter customer information and validate
	  //7. click finish button
	  //8. click logout and validate
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  launchBrowser ();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  Base.sleep(7000);
	  driver.quit();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
