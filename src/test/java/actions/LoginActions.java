package actions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import pages.LoginPage;

public class LoginActions {
  
	static LoginPage objLogin;
	
	//construtor
	public LoginActions(WebDriver driver) {
		//iniciar Page Objects
		objLogin = new LoginPage(driver);
	}
	
	//ações 
	
	public void doLogin() {
		String username = "daniela.pochini";
		String password = "dani123";
		objLogin.getUsername().sendKeys(username);
		objLogin.getPassword().sendKeys(password);
		objLogin.getBtnLogin().submit();
	}
	
	public void doWrongLogin() {
		String username = "daniela.pochini";
		String password = "dani124"; 
		objLogin.getUsername().sendKeys(username);
		objLogin.getPassword().sendKeys(password);
		objLogin.getBtnLogin().submit(); 
		String expectedResult = "Your account may be disabled or blocked or the username/password you entered is incorrect.";
		String actualResult = objLogin.getAlertPass().getText();
		assertEquals(expectedResult, actualResult);
	}
	
	public void doEmptyField() {
		String username = "";
		String password = ""; 
		objLogin.getUsername().sendKeys(username);
		objLogin.getPassword().sendKeys(password);
		objLogin.getBtnLogin().submit(); 
		String expectedResult = "Your account may be disabled or blocked or the username/password you entered is incorrect.";
		String actualResult = objLogin.getAlertPass().getText();
		assertEquals(expectedResult, actualResult);
	}
	public void recoverPass() {
		objLogin.getBtnLostPass().click();
	}
}
