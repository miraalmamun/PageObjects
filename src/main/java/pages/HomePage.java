package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	// code to read from prop
	//@FindBy(xpath="/html/body/div[3]/div[2]/div/a[4]")
	//WebElement signInLink;
	
	//This is testing
	
	
	public HomePage(WebDriver driver) {
		System.out.println("Home Page constructor");
		this.driver=driver;
	}
	public void isElementPresent(String xpath) {
		
	}
	
	public LoginPage goToLoginPage() {
		driver.get("http://zoho.com");
		// read this from prop file
        driver.findElement(By.xpath("html/body/div[3]/div[2]/div/a[4]")).click();
        //LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		return new LoginPage(driver);
		
	}

}
