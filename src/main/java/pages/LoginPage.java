package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	//se.le.ni.umtraining10@gmail.com
	
	//@FindBy(id="login_id")
	//WebElement usernameField;
	
	//@FindBy(id="nextbtn")
	//WebElement nextButton;
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	
	public LandingPage doLogin(String username, String password) {
		driver.findElement(By.id("login_id")).sendKeys(username);
		driver.findElement(By.id("nextbtn")).click();
		return new LandingPage();
	}

}
