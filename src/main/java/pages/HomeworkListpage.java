package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomeworkListpage {

	WebDriver driver;

	public HomeworkListpage(WebDriver driver) {
		this.driver = driver;
	}
	//Element Library
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]")
	WebElement AccountStatus ;
	
	public String getAccountStatus() {
		return AccountStatus.getText();
		
	}
	
}
