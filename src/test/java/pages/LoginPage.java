package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy; 

import util.PageObject;

public class LoginPage extends PageObject{ 
	 
	public LoginPage(WebDriver driver) {
		super(driver); 
	}

	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;	
	
	@FindBy(className="button")
	private WebElement btnLogin;
	
	@FindBy(xpath="//a[contains(text(),'Lost your password?')]")
	private WebElement btnLostPass;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/font[1]")
	private WebElement alertPass;
 
	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(WebElement btnLogin) {
		this.btnLogin = btnLogin;
	}
	

	public WebElement getBtnLostPass() {
		return btnLostPass;
	}

	public void setBtnLostPass(WebElement btnLostPass) {
		this.btnLostPass = btnLostPass;
	}
	
	public WebElement getAlertPass() {
		return alertPass;
	}

	public void setAlertPass(WebElement alertPass) {
		this.alertPass = alertPass;
	}

}
