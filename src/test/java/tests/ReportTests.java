package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import util.BaseTest;

public class ReportTests extends BaseTest{

	@Test 
	@Tag("Issue")
	public void selectProject() {
		actLogin.doLogin();
		actMyView.reportIssue();
		actReport.selectProject();
		actReport.addNewIssue();
	}
	
	@Test 
	@Tag("Issue")
	public void createIssue() { 
		actLogin.doLogin();
		actMyView.reportIssue();
		actReport.selectProject();
		actReport.addNewIssue();
	}
	
	@Test 
	@Tag("Issue")
	public void validateSummaryRequiredField() { 
		actLogin.doLogin();
		actMyView.reportIssue();
		actReport.selectProject();
		actReport.validateSummaryField();
	}
	
	@Test 
	@Tag("Issue")
	public void validateDescriptionRequiredField() { 
		actLogin.doLogin();
		actMyView.reportIssue();
		actReport.selectProject();
		actReport.validateDescriptionField();
	}
	
	@Test 
	@Tag("Issue")
	public void validateCategoryRequiredField() { 
		actLogin.doLogin();
		actMyView.reportIssue();
		actReport.selectProject();
		actReport.validateCategoryField();
	}
	
}
