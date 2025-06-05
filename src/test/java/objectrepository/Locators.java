package objectrepository;

import org.openqa.selenium.By;

public class Locators {
	
	// locators for login page 
	public static By userName = By.id("user-name");
	public static By password = By.name("password");
	public static By loginButton = By.id("login-button");
	
	public static By firstProduct = By.xpath("//div[text()='Sauce Labs Backpack']");

}
