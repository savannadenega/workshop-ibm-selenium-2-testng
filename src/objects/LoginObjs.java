package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginObjs {

	public WebElement textAdmin(WebDriver driver) {
		String id = "txtUsername";
		return driver.findElement(By.id(id));
	}
	
	public WebElement textPassword(WebDriver driver) {
		String id = "txtPassword";
		return driver.findElement(By.id(id));
	}
	
	public WebElement buttonLogin(WebDriver driver) {
		String id = "btnLogin";
		return driver.findElement(By.id(id));
	}
}
