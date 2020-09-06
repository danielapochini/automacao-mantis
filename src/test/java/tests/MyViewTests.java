package tests; 
 
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import util.BaseTest;  

public class MyViewTests extends BaseTest{
 
 	@Test
 	@Tag("View")
 	public void viewIssues() {
 		actLogin.doLogin(); 
 		actMyView.checkIssues();
 		actMyView.doLogout();
 	}
 	
 	@Test
 	@Tag("View")
 	public void reportIssues() {
 		actLogin.doLogin(); 
 		actMyView.reportIssue();
 		actMyView.doLogout();
 	}

 

}
