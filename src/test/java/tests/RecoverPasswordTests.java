package tests;
 
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import util.BaseTest;

public class RecoverPasswordTests extends BaseTest{

	@Test
	@Tag("RecoverPass")
	public void recoverPasswordEmptyFields() {
		actLogin.recoverPass();
		actRecover.emptyFields();
		
	}

	@Test
	@Tag("RecoverPass")
	public void recoverPasswordValidUser() {
		actLogin.recoverPass();
		actRecover.validUser();
	}
	
	
	@Test
	@Tag("RecoverPass")
	public void recoverPasswordWrongUser() {
		actLogin.recoverPass();
		actRecover.wrongUser();
	}

}
