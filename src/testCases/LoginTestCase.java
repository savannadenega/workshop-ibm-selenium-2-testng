package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utils.WebDriverInstance;
import objects.LoginObjs;

public class LoginTestCase extends WebDriverInstance {

	LoginObjs loginObjs = PageFactory.initElements(driver, LoginObjs.class);

	
	@Test(groups = "info")
	public void insertTextAdmin() throws InterruptedException {
		Thread.sleep(1000);
		loginObjs.textAdmin(driver).sendKeys("Admin");
	}
	
	@Test(groups = "info")
	public void insertTextPassword() throws InterruptedException {
		Thread.sleep(1000);
		loginObjs.textPassword(driver).sendKeys("admin");
	}
	
	@Test(dependsOnGroups  = "info")
	public void clickLogin() throws InterruptedException {
		Thread.sleep(1000);
		loginObjs.buttonLogin(driver).click();
	}
	
}
