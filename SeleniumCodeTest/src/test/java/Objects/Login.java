package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

		WebDriver driver;
		
		public Login(WebDriver driver) {
			this.driver = driver;
		}
		By userName = By.id("user-name");
		By password = By.id("password");
		By loginButton = By.id("login-button");
		
	public void enterLoginCredential(String userName, String password) {
		driver.findElement(this.userName).sendKeys(userName);
		driver.findElement(this.password).sendKeys(password);
		driver.findElement(this.loginButton).click();
	}
	
	
}
