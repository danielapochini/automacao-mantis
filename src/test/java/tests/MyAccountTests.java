package tests;
 
  
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import util.BaseTest;
@TestMethodOrder(OrderAnnotation.class)
public class MyAccountTests extends BaseTest{
 
	@Test 
	@Tag("Account")
	public void validateProfilePermission() {
		actLogin.doLogin();
		actMyView.goToAccount();
		actAccount.clickProfile();
		actAccount.tryPermission();   
	}
	
	@Test
	@Tag("Account")
	public void updateUserRealName() { 
		actLogin.doLogin();
		actMyView.goToAccount();
		actAccount.updateUserRealName();
	}
	
	@Test
	@Tag("Account")
	@Order(1)
	public void createProfile() { 
		actLogin.doLogin();
		actMyView.goToAccount();
		actAccount.clickProfile();
		actAccount.addNewProfile();
	}
	
	@Test
	@Tag("Account")
	@Order(2)
	public void updateProfile() { 
		actLogin.doLogin();
		actMyView.goToAccount();
		actAccount.clickProfile();
		actAccount.editProfile();
	}
	
	@Test
	@Tag("Account")
	public void validatePlatformRequiredField() { 
		actLogin.doLogin();
		actMyView.goToAccount();
		actAccount.clickProfile();
		actAccount.validatePlatformField();
	}
	
	@Test
	@Tag("Account")
	public void validateOSRequiredField() {
		actLogin.doLogin();
		actMyView.goToAccount();
		actAccount.clickProfile();
		actAccount.validateOsField();
	}

	@Test
	@Tag("Account")
	public void validateOSBuildRequiredField() {
		actLogin.doLogin();
		actMyView.goToAccount();
		actAccount.clickProfile();
		actAccount.validateOsBuildField();
	}
}
