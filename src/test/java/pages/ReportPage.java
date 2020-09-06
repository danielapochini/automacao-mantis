package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import util.PageObject;

public class ReportPage extends PageObject{ 
	
	public ReportPage(WebDriver driver) {
		super(driver); 
	}
	
	@FindBy(name="project_id")
	private WebElement selectProject;
	
	@FindBy(name="summary")
	private WebElement summary;
	
	@FindBy(name="description")
	private WebElement desc;
	
	@FindBy(xpath="//input[@class='button']")
	private WebElement btnSubmit;
	
	@FindBy(name="category_id")
	private WebElement selectCategory;
	 
	@FindBy(xpath="/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/p[1]")
	private WebElement msgValidate;
	
	@FindBy(xpath="//div[contains(text(),'Operation successful.')]")
	private WebElement msgSucess;
	
	public WebElement getMsgSucess() {
		return msgSucess;
	}

	public void setMsgSucess(WebElement msgSucess) {
		this.msgSucess = msgSucess;
	}

	public WebElement getMsgValidate() {
		return msgValidate;
	}

	public void setMsgValidate(WebElement msgValidate) {
		this.msgValidate = msgValidate;
	}

	public WebElement getSelectProject() {
		return selectProject;
	}

	public void setSelectProject(WebElement selectProject) {
		this.selectProject = selectProject;
	}

	public WebElement getSummary() {
		return summary;
	}

	public void setSummary(WebElement summary) {
		this.summary = summary;
	}

	public WebElement getDesc() {
		return desc;
	}

	public void setDesc(WebElement desc) {
		this.desc = desc;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public void setBtnSubmit(WebElement btnSubmit) {
		this.btnSubmit = btnSubmit;
	}

	public WebElement getSelectCategory() {
		return selectCategory;
	}

	public void setSelectCategory(WebElement selectCategory) {
		this.selectCategory = selectCategory;
	}

	public void select_project(String status){
	     Select statusDropdown = new Select(selectProject);
	     statusDropdown.selectByVisibleText(status);
	}
	
	public void select_category(String status){
	     Select statusDropdown = new Select(selectCategory);
	     statusDropdown.selectByVisibleText(status);
	}
}
