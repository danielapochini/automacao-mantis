package actions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
 
import pages.MyViewPage;

public class MyViewActions {
	
	static MyViewPage objMV;
	
	//construtor
	public MyViewActions(WebDriver driver) {
		//iniciar Page Objects
		objMV = new MyViewPage(driver);
	}

	//ações
	
	public void verifyUser() {
		String expectedResult = "daniela.pochini";
		String actualResult = objMV.getLoggedUser().getText();
		assertEquals(expectedResult, actualResult);
	}
	
	public void checkIssues() {
		objMV.getBtnViewIssues().click();
	}
	
	public void reportIssue() {
		objMV.getBtnReportIssues().click();
	}
	

	public void goToAccount() {
		objMV.getBtnAccount().click();
	}
	
	public void doLogout() {
		objMV.getBtnLogout().click();
	}
	
}
