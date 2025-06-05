package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import objectrepository.Locators;
import utils.Reporter;


public class ProductPage {
	
	WebDriver driver;
    WebDriverWait wait;
    ExtentTest test;

    public ProductPage(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.test = test;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickOnFirstProduct() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(Locators.firstProduct)).click();
            Reporter.generateReport(driver, test, Status.PASS, "Clicked on the first product successfully");
        } catch (Exception e) {
            Reporter.generateReport(driver, test, Status.FAIL, "Failed to click on the first product");
        }
    }

}