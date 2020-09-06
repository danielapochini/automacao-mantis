package util; 

import java.util.concurrent.TimeUnit;
 
import org.junit.jupiter.api.AfterEach; 
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

import actions.AccountActions;
import actions.LoginActions;
import actions.MyViewActions;
import actions.RecoverActions;
import actions.ReportActions;
import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class BaseTest{
	protected static WebDriver driver;
	protected static LoginActions actLogin;
	protected static MyViewActions actMyView;
	protected static RecoverActions actRecover;
	protected static AccountActions actAccount;
	protected static ReportActions actReport;
 
    @BeforeEach
    void openBrowser(){
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();  
	 	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 	driver.manage().window().maximize(); 
	 	driver.get("https://mantis-prova.base2.com.br/");

	 	actLogin = new LoginActions(driver);
	 	actMyView = new MyViewActions(driver);
	 	actRecover = new RecoverActions(driver);
	 	actAccount = new AccountActions(driver);
	 	actReport = new ReportActions(driver);
    }

    @AfterEach
    void quitBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
