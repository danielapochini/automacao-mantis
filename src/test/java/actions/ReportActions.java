package actions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
 
import pages.ReportPage;

public class ReportActions {
	static ReportPage objReport;
	
	public ReportActions(WebDriver driver) {
		//iniciar Page Objects
		objReport = new ReportPage(driver);
	}
	
	public void selectProject() {
		String status = "Daniela Pochini´s Project";
		objReport.select_project(status); 
		objReport.getBtnSubmit().submit();
	}
	
	public void addNewIssue() {
		String summary = "Teste Auto";
		String desc = "Teste"; 
		String status = "[All Projects] General";
		objReport.select_category(status);
		objReport.getSummary().sendKeys(summary); 
		objReport.getDesc().sendKeys(desc); 
		objReport.getBtnSubmit().submit(); 
	}
	
	public void validateSummaryField() {
		String empty = ""; 
		objReport.getSummary().sendKeys(empty); 
		objReport.getDesc().sendKeys(empty); 
		objReport.getBtnSubmit().submit();
		String expectedResult = "A necessary field \"Summary\" was empty. Please recheck your inputs.";
		String actualResult = objReport.getMsgValidate().getText();
		assertEquals(expectedResult, actualResult);
	}
	
	public void validateDescriptionField() {
		String summary = "Teste";
		String empty = ""; 
		objReport.getSummary().sendKeys(summary); 
		objReport.getDesc().sendKeys(empty); 
		objReport.getBtnSubmit().submit();
		String expectedResult = "A necessary field \"Description\" was empty. Please recheck your inputs.";
		String actualResult = objReport.getMsgValidate().getText();
		assertEquals(expectedResult, actualResult);
	}
	
	public void validateCategoryField() {
		String summary = "Teste Auto";
		String desc = "Teste"; 
		objReport.getSummary().sendKeys(summary); 
		objReport.getDesc().sendKeys(desc); 
		objReport.getBtnSubmit().submit();
		String expectedResult = "A necessary field \"Category\" was empty. Please recheck your inputs.";
		String actualResult = objReport.getMsgValidate().getText();
		assertEquals(expectedResult, actualResult);
	}
}
