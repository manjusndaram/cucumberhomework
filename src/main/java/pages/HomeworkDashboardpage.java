package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomeworkDashboardpage {
	WebDriver driver;
//Element Library
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")
	WebElement BankAndCashButton;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	WebElement NewAccountButton;
	

	public HomeworkDashboardpage(WebDriver driver) {
		this.driver = driver;
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void clickBankAndCashButton() {
		BankAndCashButton.click();
		
	}
	
	public void clickNewAccountButton() {
		NewAccountButton.click();
		
	}
	
	
}
