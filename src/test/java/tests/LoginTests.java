package tests;
 

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test; 
import util.BaseTest; 
 
public class LoginTests extends BaseTest{ 
	
 	@Test
 	@Tag("View")
	 public void validateUser() { 
		actLogin.doLogin();   
		actMyView.verifyUser(); 
		actMyView.doLogout();
	 }
 	
	@Test 
	@Tag("Login")
	public void validateLoginWrongUser() {
		actLogin.doWrongLogin(); 
	}
	
	@Test
	@Tag("Login")
	public void validateLoginEmptyFields() {
		actLogin.doEmptyField();
	}
}
