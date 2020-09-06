package actions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import pages.AccountPage; 

public class AccountActions {
	static AccountPage objAcc;
 
	//construtor
	
	public AccountActions(WebDriver driver) {
		//iniciar Page Objects
		objAcc = new AccountPage(driver);
	}
	
	//ações 
	
	public void updateUserRealName() { 
		String password = "dani123";
		String name = "Daniela Pereira Pochini";
		objAcc.getPassword().sendKeys(password);
		objAcc.getConfirmPass().sendKeys(password);
		objAcc.getRealname().clear();
		objAcc.getRealname().sendKeys(name);
		objAcc.getBtnSubmit().submit();  
		String expectedResult = "(Daniela Pereira Pochini - reporter)";
		String actualResult = objAcc.getNameUser().getText();
		assertEquals(expectedResult, actualResult);
	}
	
	public void clickProfile() {
		objAcc.getBtnProfile().click(); 
	}
	 
	public void addNewProfile() {
		String platform = "Teste Auto";
		String os = "2020";
		String osbuild = "05.09";
		String desc = "Optional";
		objAcc.getPlatform().sendKeys(platform);
		objAcc.getOs().sendKeys(os);
		objAcc.getOsBuild().sendKeys(osbuild);
		objAcc.getDescription().sendKeys(desc);
		objAcc.getBtnAddProfile().click();
		 
	}
	
	public void validatePlatformField() {
		String platform = ""; 
		objAcc.getPlatform().sendKeys(platform); 
		objAcc.getBtnAddProfile().click();
		String expectedResult = "A necessary field \"Platform\" was empty. Please recheck your inputs.";
		String actualResult = objAcc.getMsgValidate().getText();
		assertEquals(expectedResult, actualResult);
	}
	
	public void validateOsField() {
		String platform = "Teste Auto"; 
		String os = "";
		objAcc.getPlatform().sendKeys(platform);
		objAcc.getOs().sendKeys(os);
		objAcc.getBtnAddProfile().click();
		String expectedResult = "A necessary field \"Operating System\" was empty. Please recheck your inputs.";
		String actualResult = objAcc.getMsgValidate().getText();
		assertEquals(expectedResult, actualResult);
	}
	
	public void validateOsBuildField() {
		String platform = "Teste Auto"; 
		String os = "2020";
		String osbuild = "";
		objAcc.getOsBuild().sendKeys(osbuild);
		objAcc.getPlatform().sendKeys(platform);
		objAcc.getOs().sendKeys(os);
		objAcc.getBtnAddProfile().click();
		String expectedResult = "A necessary field \"Version\" was empty. Please recheck your inputs.";
		String actualResult = objAcc.getMsgValidate().getText();
		assertEquals(expectedResult, actualResult);
	}
	
	public void editProfile() {
		String status = "Teste Auto 2020 05.09";
		String platform = "Teste Auto 2";
		objAcc.getCheckboxEditProfile().isSelected();
		objAcc.select_list(status);
		objAcc.getBtnSubmitProfile().submit();
		objAcc.getPlatform().sendKeys(platform);
		objAcc.getBtnSubmit().submit(); 
		String expectedResult = "Teste Auto 2 2020 05.09";
		boolean actualResult = objAcc.getSelectProfile().getText().contains(expectedResult);
		assertTrue(actualResult);
	}
	
	public void tryPermission() {
		String status = "PC Windows XP";
		objAcc.getBtnProfile();
		objAcc.getCheckboxEditProfile().isSelected();
		objAcc.select_list(status); 
		objAcc.getBtnSubmitProfile().submit();
		String expectedResult = "Access Denied.";
		String actualResult = objAcc.getMessage().getText();
		assertEquals(expectedResult, actualResult);
	}
	
}
