package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy; 

import util.PageObject;

public class MyViewPage extends PageObject{ 

	public MyViewPage(WebDriver driver) {
		super(driver); 
	} 
	
	@FindBy(xpath="/html/body/table[1]/tbody/tr/td[1]/span[1]")
	private WebElement loggedUser;

	@FindBy(xpath="//a[contains(text(),'Logout')]")
	private WebElement btnLogout;
	
	@FindBy(linkText="View Issues")
	private WebElement btnViewIssues;
	
	@FindBy(linkText="Report Issue")
	private WebElement btnReportIssues;
	
  
	@FindBy(linkText="My Account")
	private WebElement btnAccount;
  
	public WebElement getLoggedUser() {
		return loggedUser;
	}


	public void setLoggedUser(WebElement loggedUser) {
		this.loggedUser = loggedUser;
	}

	public WebElement getBtnLogout() {
		return btnLogout;
	}


	public void setBtnLogout(WebElement btnLogout) {
		this.btnLogout = btnLogout;
	}
	
	public WebElement getBtnViewIssues() {
		return btnViewIssues;
	}


	public void setBtnViewIssues(WebElement btnViewIssues) {
		this.btnViewIssues = btnViewIssues;
	} 
	
	public WebElement getBtnReportIssues() {
		return btnReportIssues;
	}


	public void setBtnReportIssues(WebElement btnReportIssues) {
		this.btnReportIssues = btnReportIssues;
	}


	public WebElement getBtnAccount() {
		return btnAccount;
	}


	public void setBtnAccount(WebElement btnAccount) {
		this.btnAccount = btnAccount;
	}

	
	

}
