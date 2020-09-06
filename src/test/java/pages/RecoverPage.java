package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy; 

import util.PageObject;

public class RecoverPage extends PageObject{ 
	
	public RecoverPage(WebDriver driver) {
		super(driver); 
	}

	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(xpath="//input[@class='button']")
	private WebElement btnSubmit;

	@FindBy(xpath="/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/p[1]")
	private WebElement errorMessage;
 
	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public void setBtnSubmit(WebElement btnSubmit) {
		this.btnSubmit = btnSubmit;
	}

	public WebElement getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(WebElement errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
	
}
