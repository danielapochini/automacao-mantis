package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.ui.Select;

import util.PageObject;

public class AccountPage extends PageObject{ 
	  
	public AccountPage(WebDriver driver) {
		super(driver); 
	}
 
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="password_confirm")
	private WebElement confirmPass;
	
	@FindBy(name="realname")
	private WebElement realname;
	
	@FindBy(xpath="//input[@class='button']")
	private WebElement btnSubmit;
	
	@FindBy (xpath="//div[contains(text(),'Operation successful.')]")
	private WebElement operationMsg;
	
	@FindBy(xpath="//a[contains(text(),'Profiles')]")
	private WebElement btnProfile;
	
	@FindBy(name = "platform")
	private WebElement platform;
	
	@FindBy(name = "os")
	private WebElement os;
	
	@FindBy(name = "os_build")
	private WebElement osBuild;
	
	@FindBy(name = "description")
	private WebElement description;
	
	@FindBy(xpath = "//tr[6]//td[2]//input[1]")
	private WebElement btnAddProfile;
	
	@FindBy(xpath="//span[@class='small']")
	private WebElement nameUser;
	
	@FindBy(xpath="//tr[2]//td[1]//input[1]")
	private WebElement checkboxEditProfile;
	
	@FindBy(name="profile_id")
	private WebElement selectProfile;
	
	@FindBy(xpath="//tr[4]//td[1]//input[1]")
	private WebElement btnSubmitProfile;
	
	@FindBy(xpath="/html[1]/body[1]/center[1]/p[1]")
	private WebElement message;
	
	@FindBy(className="bracket-link")
	private WebElement linkTo; 
	
	public WebElement getMsgValidate() {
		return msgValidate;
	} 

	public void setMsgValidate(WebElement msgValidate) {
		this.msgValidate = msgValidate;
	}


	@FindBy(xpath="/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/p[1]")
	private WebElement msgValidate;
 	
	public WebElement getOperationMsg() {
		return operationMsg;
	}


	public WebElement getNameUser() {
		return nameUser;
	}

	public WebElement getPlatform() {
		return platform;
	}


	public void setPlatform(WebElement platform) {
		this.platform = platform;
	}


	public WebElement getOs() {
		return os;
	}


	public void setOs(WebElement os) {
		this.os = os;
	}


	public WebElement getOsBuild() {
		return osBuild;
	}


	public void setOsBuild(WebElement osBuild) {
		this.osBuild = osBuild;
	}


	public WebElement getDescription() {
		return description;
	}


	public void setDescription(WebElement description) {
		this.description = description;
	}


	public WebElement getBtnAddProfile() {
		return btnAddProfile;
	}


	public void setBtnAddProfile(WebElement btnAddProfile) {
		this.btnAddProfile = btnAddProfile;
	}


	public WebElement getLinkTo() {
		return linkTo;
	}

	

	public void setLinkTo(WebElement linkTo) {
		this.linkTo = linkTo;
	}


	public void setNameUser(WebElement nameUser) {
		this.nameUser = nameUser;
	}

	public void setOperationMsg(WebElement operationMsg) {
		this.operationMsg = operationMsg;
	}




	public WebElement getBtnSubmitProfile() {
		return btnSubmitProfile;
	}



	public void setBtnSubmitProfile(WebElement btnSubmitProfile) {
		this.btnSubmitProfile = btnSubmitProfile;
	}



	public WebElement getPassword() {
		return password;
	}


	public void setPassword(WebElement password) {
		this.password = password;
	}


	public WebElement getConfirmPass() {
		return confirmPass;
	}


	public void setConfirmPass(WebElement confirmPass) {
		this.confirmPass = confirmPass;
	}


	public WebElement getRealname() {
		return realname;
	}


	public void setRealname(WebElement realname) {
		this.realname = realname;
	}


	public WebElement getBtnSubmit() {
		return btnSubmit;
	}


	public void setBtnSubmit(WebElement btnSubmit) {
		this.btnSubmit = btnSubmit;
	}


	public WebElement getBtnProfile() {
		return btnProfile;
	}


	public void setBtnProfile(WebElement btnProfile) {
		this.btnProfile = btnProfile;
	}


	public WebElement getCheckboxEditProfile() {
		return checkboxEditProfile;
	}


	public void setCheckboxEditProfile(WebElement checkboxEditProfile) {
		this.checkboxEditProfile = checkboxEditProfile;
	}


	public WebElement getSelectProfile() {
		return selectProfile;
	}


	public void setSelectProfile(WebElement selectProfile) {
		this.selectProfile = selectProfile;
	}


	public WebElement getMessage() {
		return message;
	}


	public void setMessage(WebElement message) {
		this.message = message;
	}
	
	
	public void select_list(String status){
	     Select statusDropdown = new Select(selectProfile);
	     statusDropdown.selectByVisibleText(status);
	}
	
}
