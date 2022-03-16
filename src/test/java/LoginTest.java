import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;

public class LoginTest {
	
	
	@Test
	public void doLogin() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = homePage.goToLoginPage();
		LandingPage landingPage = loginPage.doLogin("se.le.ni.umtraining10@gmail.com", "Zoho@123");
	}
	
	
	//Pagefactory
	/*
	@Test
	public void doLoginPF() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// creates object and passes the driver
		// initiazes the page objects
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);// 2 things
        homePage.isElementPresent("/html/body/div[3]/div[2]/div/a[4]");
		LoginPage loginPage = homePage.goToLoginPage();
		LandingPage landingPage = loginPage.doLogin("se.le.ni.umtraining10@gmail.com", "Zoho@123");
	}
	*/
	
}
