package actions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
 
import pages.RecoverPage;

public class RecoverActions {
	
	static RecoverPage objRecover;
	
	//construtor
	public RecoverActions(WebDriver driver) {
		//iniciar Page Objects
		objRecover = new RecoverPage(driver);
	}

	//ações 
	public void validUser() {
		String username = "daniela.pochini";
		String email = "daniela.pochini@fatec.sp.gov.br"; 		
		objRecover.getUsername().sendKeys(username);
		objRecover.getEmail().sendKeys(email);
		objRecover.getBtnSubmit().click(); 
		String expectedResult = "Password Message Sent";
		String actualResult = objRecover.getErrorMessage().getText();
		assertEquals(expectedResult, actualResult);
	}
	
	public void wrongUser() {
		String username = "daniela.pochini";
		String email = "teste@teste.com.br"; 		
		objRecover.getUsername().sendKeys(username);
		objRecover.getEmail().sendKeys(email);
		objRecover.getBtnSubmit().click(); 
		String expectedResult = "The provided information does not match any registered account!";
		String actualResult = objRecover.getErrorMessage().getText();
		assertEquals(expectedResult, actualResult);
	}
	

	public void emptyFields() {
		String username = "";
		String email = ""; 		
		objRecover.getUsername().sendKeys(username);
		objRecover.getEmail().sendKeys(email);
		objRecover.getBtnSubmit().click(); 
		String expectedResult = "Invalid e-mail address.";
		String actualResult = objRecover.getErrorMessage().getText();
		assertEquals(expectedResult, actualResult);
	}
}
